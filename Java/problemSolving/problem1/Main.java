package problemSolving.problem1;

public class Main {

    public static void main(String[] args) {
        GasPoweredCar car1 = new GasPoweredCar("hhssxs",5, 20);
        ElectricCar car2 = new ElectricCar("ghassfa",25, 2000);
        HybridCar car3 = new HybridCar("auagusguws",0, 1500, 20);


        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
    
}
