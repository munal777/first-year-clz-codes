package problemSolving.problem2;

public class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void display()
    {
        System.out.println("Model: " + model);
        System.out.println("brand: " + brand);
    }
}
