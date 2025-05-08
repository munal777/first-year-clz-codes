package problemSolving.problem1;

public class GasPoweredCar extends Car {

    private double avgPerLitre;
    private int cylinders;

    GasPoweredCar (String description, double avgPerLitre, int cylinders)
    {
        super(description);
        this.avgPerLitre = avgPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgPerLitre() {
        return avgPerLitre;
    }
    public void setAvgPerLitre(double avgPerLitre) {
        this.avgPerLitre = avgPerLitre;
    }
    public int getCylinders() {
        return cylinders;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String toString()
    {
        return avgPerLitre + " litre" + "\n" + "cylinderSize " + cylinders + " litre";
    }
    
}
