package workshop.week16;

public class CarToBuy extends Car {
    
        double price;
        int registerdYear;

        public CarToBuy(String name, String description, double price, int registerdYear)
        {
            super(name, description);
            this.price = price;
            this.registerdYear = registerdYear;
        }

        @Override
        public void display()
        {
            System.out.println(name);
            System.out.println(description);
            System.out.println(price);
            System.out.println(registerdYear);
        }

}

 class InnerCarToBuy {

    public static void main(String[] args) {
        CarToBuy obj = new CarToBuy("bmw", "5 driving mode", 2000,2010);
        obj.display();
    }
}
