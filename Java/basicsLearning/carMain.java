package basicsLearning;

public class carMain {
    public static void main(String[] args) {
        Car car1 = new Car("TATA","Maruti",2019);
        
        //creating object for java copy object
        Car car2 = new Car(car1);

        // System.out.println(car1.toString());


        System.out.println(car1.getCarCompany() + "\n" + car1.getCarModel() + "\n" + car1.getCarName() );
        System.out.println(car2.getCarCompany() + "\n" + car2.getCarModel() + "\n" + car2.getCarName() );

    }
}
