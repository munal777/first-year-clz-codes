package workshop.week16;

public class Bird implements LivingBeing {
    public void specialfeature()
    {
        System.out.println("bird can fly in sky.");
    }
}

class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();

        bird.specialfeature();
        fish.specialfeature();
    }
}