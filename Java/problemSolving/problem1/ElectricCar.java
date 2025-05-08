package problemSolving.problem1;

public  class ElectricCar extends Car{

    private double avgPerCharge;
    private int batterySize;

    ElectricCar(String description, double avgPerCharge, int batterySize)
    {
        super(description);
        this.avgPerCharge = avgPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgPerCharge() {
        return avgPerCharge;
    }
    public void setAvgPerCharge(double avgPerCharge) {
        this.avgPerCharge = avgPerCharge;
    }
    public int getBatterySize() {
        return batterySize;
    }
    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }


    public String toString()
    {
        return avgPerCharge + "% runs 200Km" + "\n" + batterySize + " mh";
    } 

    
} 
