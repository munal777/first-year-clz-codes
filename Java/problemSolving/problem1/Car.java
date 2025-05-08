package problemSolving.problem1;

public class Car {

    String description;

    Car(String description)
    {
        this.description = description;
    }

    void startEngine()
    {
        System.out.println("Car first start the engine.");
    }

    void drive()
    {
        System.out.println("Car start to run.");
    }

    protected void runEngine()
    {
        System.out.println("whlie running engine it consume energy.");
    }
    
}
