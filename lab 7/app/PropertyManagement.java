package Uap.app;

import Uap.Property;
import Uap.PropertyManager;
import java.util.ArrayList;
import java.util.Scanner;

public class PropertyManagement {
    public static void main(String[] args) {
        PropertyManager propertyManager = new PropertyManager("Sakib Hossaine");
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("1 to view all");
            System.out.println("2 to view a specific item");
            System.out.println("3 to add Property");
            System.out.println("4 to sell Expected Rent");
            System.out.println("5 to Add facilities");
            System.out.println("6 to remove facilities");
            System.out.println("0 to exit");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    propertyManager.viewAll();
                    break;
                case 2:
                    System.out.println("Enter property id:");
                    String id = scanner.next();
                    propertyManager.viewDetails(id);
                    break;
                
                case 3:// (add Property)
                System.out.println("Enter property id:");
                 String propertyId = scanner.next();
                 System.out.println("Enter property description:");
                scanner.nextLine(); 
               String description = scanner.nextLine();
                 System.out.println("Enter property location:");
                String location = scanner.nextLine();
                System.out.println("Enter property category:");
              String category = scanner.nextLine();
                System.out.println("Enter expected rent:");
               double rent = scanner.nextDouble();
                System.out.println("Enter number of facilities:");
                int numFacilities = scanner.nextInt();
               ArrayList<String> facilities = new ArrayList<>();
                for (int i = 0; i < numFacilities; i++) {
                   System.out.println("Enter facility " + (i+1) + ":");
                   scanner.nextLine(); 
                       String facility = scanner.nextLine();
                      facilities.add(facility);
                       }
                 propertyManager.addProperty(propertyId, description, location, category, facilities, rent);
                 System.out.println("Property added successfully.");
                           break;
                   
             
                    case 4: //(sell Expected Rent)
                     System.out.println("Enter property id:");
                            String propertyIdForRent = scanner.next();
                                System.out.println("Enter expected rent:");
                        double newRent = scanner.nextDouble();
                  Property propertyForRent = propertyManager.findProperty(propertyIdForRent);
                      if (propertyForRent != null) {
                   propertyForRent.setExpectedRent(newRent);
                   System.out.println("Expected rent set successfully.");
                }
                 else
                  {
                        System.out.println("Property not found.");
                      }
                      break;
                   
                case 5:
                    // (Add facilities)
                    System.out.println("Enter property id:");
                    String propertyIdForFacility = scanner.next();
                    System.out.println("Enter number of facilities to add:");
                    int numFacilitiesToAdd = scanner.nextInt();
                    ArrayList<String> facilitiesToAdd = new ArrayList<>();
                    for (int i = 0; i < numFacilitiesToAdd; i++) 
                    {
                        System.out.println("Enter facility " + (i+1) + ":");
                        scanner.nextLine();  
                        String facility = scanner.nextLine();
                        facilitiesToAdd.add(facility);
                    }
                    propertyManager.addFacilities(propertyIdForFacility, facilitiesToAdd);
                    System.out.println("Facilities added successfully.");
                    break;
                
                case 6:
                             System.out.println("Enter property id:");
                                 String propertyIdForFacilityRemoval = scanner.next();
                                     System.out.println("Enter number of facilities to remove:");
                                     int numFacilitiesToRemove = scanner.nextInt();
                               ArrayList<String> facilitiesToRemove = new ArrayList<>();
                          for (int i = 0; i < numFacilitiesToRemove; i++) {
                    System.out.println("Enter facility " + (i+1) + ":");
                           scanner.nextLine(); 
                        String facility = scanner.nextLine();
                    facilitiesToRemove.add(facility);
                }
                propertyManager.removeFacilities(propertyIdForFacilityRemoval, facilitiesToRemove);
                System.out.println("Facilities removed successfully.");
                break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);
    }
}