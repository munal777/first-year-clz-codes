package problemSolving.problem2;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors)
    {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Number of Door: "+ numberOfDoors);
    }

    public static void main(String[] args) {
        Car car1 = new Car("TATA", "2022", 2);
        car1.display();
    }
}
