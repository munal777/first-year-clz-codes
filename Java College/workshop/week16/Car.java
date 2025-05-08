package workshop.week16;

abstract class Car {
    String name;
    String description;

    Car(String name,String description)
    {
        this.name = name;
        this.description = description;
    }

    abstract void display();
}
