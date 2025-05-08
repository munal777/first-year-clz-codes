package workshop.week16;

public class Cow implements Animal, Printable {
    public void eat()
    {
        System.out.println("Cow eat Grass.");
    }
    public void walk()
    {
        System.out.println("Cow walk slowly.");
    }
    public void display()
    {
        System.out.println("Cow dance");
    }
}

class MainCow
{
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();
        cow.walk();
        cow.display();
    }
}
