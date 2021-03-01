package web.model;


public class Car {

    private String vendor;
    private int engineCapacity;
    private int clearance;


    public Car(String vendor, int engineCapacity,int clearance) {
        this.vendor = vendor;
        this.engineCapacity = engineCapacity;
        this.clearance = clearance;
    }


    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getClearance() {
        return clearance;
    }

    public void setClearance(int clearance) {
        this.clearance = clearance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", clearance=" + clearance +
                '}';
    }
}
