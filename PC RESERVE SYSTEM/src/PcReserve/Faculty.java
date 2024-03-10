package PcReserve;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private List<Pc> pcList;

    public Faculty() {
        this.pcList = new ArrayList<>();
    }

    public void addPC(Pc pc) {
        this.pcList.add(pc);
    }

    public void reservePC(String serialNo, String reservedBy) {
        for (Pc pc : pcList) {
            if (pc.getSerialNo().equals(serialNo)) {
                if (!pc.isReserved()) {
                    pc.setReserved(true);
                    pc.setReservedBy(reservedBy);
                    System.out.println("PC reserved successfully.");
                    return;
                } else {
                    System.out.println("The PC is already reserved. Try for a different PC.");
                    return;
                }
            }
        }
        System.out.println("Invalid Serial Number. Please check the number.");
    }

    public void viewPCDetails(String serialNo) {
        for (Pc pc : pcList) {
            if (pc.getSerialNo().equals(serialNo)) {
                System.out.println("Serial Number: " + pc.getSerialNo());
                System.out.println("HD Size: " + ((Pc) pc).getHdSize());
                System.out.println("RAM: " + pc.getRam());
                System.out.println("Has GPU: " + (pc.hasGpu() ? "Yes" : "No"));
                if (pc.hasGpu()) {
                    System.out.println("VRAM: " + pc.getVram());
                }
                System.out.println("Is Reserved: " + (pc.isReserved() ? "Yes" : "No"));
                if (pc.isReserved()) {
                    System.out.println("Reserved By: " + pc.getReservedBy());
                }
                return;
            }
        }
        System.out.println("Invalid Serial Number. Please check the number.");
    }

    public void viewAvailablePCs() {
        for (Pc pc : pcList) {
            if (!pc.isReserved()) {
                System.out.println("Serial Number: " + pc.getSerialNo());
                System.out.println("HD Size: " + pc.getHdSize());
                System.out.println("RAM: " + pc.getRam());
                System.out.println("Has GPU: " + (pc.hasGpu() ? "Yes" : "No"));
                if (pc.hasGpu()) {
                    System.out.println("VRAM: " + pc.getVram());
                }
                System.out.println("Is Reserved: " + (pc.isReserved() ? "Yes" : "No"));
                if (pc.isReserved()) {
                    System.out.println("Reserved By: " + pc.getReservedBy());
                }
                System.out.println("------------------------");
            }
        }
    }

    public void makePCAvailable(String serialNo) {
        for (Pc pc : pcList) {
            if (pc.getSerialNo().equals(serialNo)) {
                if (pc.isReserved()) {
                    pc.setReserved(false);
                    pc.setReservedBy("");
                    System.out.println("PC is now available.");
                    return;
                } else {
                    System.out.println("The PC is already available.");
                    return;
                }
            }
        }
        System.out.println("Invalid Serial Number. Please check the number.");
    }

    public void findPC(String findSerialNo) {
        for (Pc pc : pcList) {
            if (pc.getSerialNo().equals(findSerialNo)) {
                System.out.println("PC found with Serial Number: " + findSerialNo);
                return;
            }
        }
        System.out.println(" No PC found " + findSerialNo);
    }
}