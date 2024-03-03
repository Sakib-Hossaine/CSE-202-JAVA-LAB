package Uap;

import java.util.ArrayList;

public class Property {
    private String id;
    private String description;
    private String location;
    private String category;
    private ArrayList<String> facilities;
    private double expectedRent;
    private boolean isAvailable;

    public Property(String id, String description, String location, String category, ArrayList<String> facilities, double expectedRent, boolean isAvailable) {
        this.id = id;
        this.description = description;
        this.location = location;
        this.category = category;
        this.facilities = facilities;
        this.expectedRent = expectedRent;
        this.isAvailable = isAvailable;
    }

    public void addFacility(String facility) {
        facilities.add(facility);
    }

    public void removeFacility(String facility) {
        facilities.remove(facility);
    }

    // Getter methods
    public String getId()
     { 
        return id;
     }
    public String getDescription() 
    { 
        return description;
     }
    public String getLocation() 
    { 
        return location; 
    }
    public String getCategory() 
    { 
        return category; 
    }
    public ArrayList<String> getFacilities() 
    {
         return facilities; 
        }
    public double getExpectedRent()
     {
         return expectedRent;
         }
    public boolean isAvailable() 
    { 
        return isAvailable; 
    }

    // Setter method for rent
    public void setExpectedRent(double expectedRent) 
    {
         this.expectedRent = expectedRent;
         }
    public void setAvailable(boolean isAvailable)
     {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id='" + id + '\'' +
                   ", description='" + description + '\'' +
                                        ", location='" + location + '\'' +
             ", category='" + category + '\'' +
                              ", facilities=" + facilities +
                                 ", expectedRent=" + expectedRent +
                        ", isAvailable=" + isAvailable +
                '}';
    }
}