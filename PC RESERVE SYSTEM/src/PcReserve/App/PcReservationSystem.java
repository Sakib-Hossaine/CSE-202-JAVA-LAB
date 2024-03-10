package PcReserve.App;

import java.util.Scanner;

import PcReserve.Faculty;
import PcReserve.Pc;
public class PcReservationSystem {
   
        public static void main(String[] args) {
            Faculty faculty = new Faculty();
            Scanner scanner = new Scanner(System.in);
    
            while (true) {
                System.out.println("\t Uap Research and Publication unit of CSE");
                System.out.println("Menu:");
                System.out.println("\t1) Add PC");
                System.out.println("\t2) Reserve PC");
                System.out.println("\t3) View PC Details");
                System.out.println("\t4) View All PCs");
                System.out.println("\t5) Make PC Available");
                System.out.println("\t6) Find PC");
                System.out.println("\t7) Exit");
                System.out.print("Enter  1 to 7  ");
                int choice = scanner.nextInt();
    
                switch (choice) {
       case 1:
                    System.out.print("Enter Serial Number: ");
                    String serialNo = scanner.next();
                    System.out.print("Enter HD Size: ");
                    int hdSize = scanner.nextInt();
                    System.out.print("Enter RAM: ");
                    int ram = scanner.nextInt();
                    System.out.print("Does the PC have a GPU? (YES/NO): ");
                    boolean hasGpu = scanner.next().equalsIgnoreCase("YES");
                    int vram = 0;
                    if (hasGpu) {
                        System.out.print("Enter VRAM: ");
                        vram = scanner.nextInt();
                    }
                    Pc pc = new Pc(serialNo, hdSize, ram, hasGpu, vram);
                    faculty.addPC(pc);
                    System.out.println("PC added successfully.");
                    break;
              
      case 2:
                    System.out.print("Enter Serial Number of the PC you want to reserve: ");
                    String reserveSerialNo = scanner.next();
                    System.out.print("Enter your name: ");
                    String reservedBy = scanner.next();
                    faculty.reservePC(reserveSerialNo, reservedBy);
                    break;
             case 3:
                    System.out.print("Enter Serial Number of the PC you want to view: ");
                    String viewSerialNo = scanner.next();
                    faculty.viewPCDetails(viewSerialNo);
                    break;
         case 4:
                        
                        faculty.viewAvailablePCs();
                        break;
                 case 5:
                        System.out.print("Enter Serial Number of the PC you want to make available: ");
                        String availableSerialNo = scanner.next();
                        faculty.makePCAvailable(availableSerialNo);
                        break;
                 case 6:
                        System.out.print("Enter Serial Number of the PC you want to find: ");
                        String findSerialNo = scanner.next();
                        faculty.findPC(findSerialNo);
                        break;
              case 7:
                        System.out.println("Exit");
                        System.exit(0);
                        break;
                }
            }
        }
    }