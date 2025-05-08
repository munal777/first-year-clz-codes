package assignment.week16;

public class CarBoat implements LandVehicle, WaterVehicle {
    
    @Override
    public void drive()
    {
        System.out.println("It has driving mode feature to drive in Land.");
    }

    @Override
    public void sail()
    {
        System.out.println("It has another special featue that can float in water.");
    }

    public static void main(String[] args) {
        CarBoat carboat = new CarBoat();

        carboat.drive();
        carboat.sail();

    }
}
