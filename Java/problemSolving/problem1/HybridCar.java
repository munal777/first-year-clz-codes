package problemSolving.problem1;

public class HybridCar extends Car{
    
    private double avgPerLitre;
    private int batterySize;
    private int cylinders;

    HybridCar (String description, double avgPerLitre, int batterySize, int cylinders)
    {
        super(description);
        this.avgPerLitre = avgPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgPerLitre() {
        return avgPerLitre;
    }

    public void setAvgPerLitre(double avgPerLitre) {
        this.avgPerLitre = avgPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getCylinder() {
        return cylinders;
    }

    public void setCylinder(int cylinders) {
        this.cylinders = cylinders;
    }

    public String toString()
    {
        return description + "\n" + avgPerLitre + " litre" + "\n" + batterySize + " mh" + "\n" + cylinders + " litre";
    }
}
