package PcReserve;

public class Pc{
    private int hdSize;
    private int ram;
    private boolean hasGpu;
    private int vram;
    private boolean isReserved;
    private String reservedBy;
    private String serialNo;

    public Pc(String serialNo, int hdSize, int ram, boolean hasGpu, int vram) {
        this.serialNo = serialNo;
        this.hdSize = hdSize;
        this.ram = ram;
        this.hasGpu = hasGpu;
        this.vram = vram;
        this.isReserved = false;
        this.reservedBy = "";
    }

    public String getSerialNo() {
        return this.serialNo;
    }

    public boolean isReserved() {
        return this.isReserved;
    }

    public void setReserved(boolean b) {
        this.isReserved = b;
    }

    public void setReservedBy(String reservedBy2) {
        this.reservedBy = reservedBy2;
    }
    public String getReservedBy() {
        return this.reservedBy;
    }

    public int getVram() {
        return this.vram;
    }

    public boolean hasGpu() {
        return this.hasGpu;
    }

    public int getRam() {
        return this.ram;
    }
    public int getHdSize() {
        return this.hdSize;
    }


}