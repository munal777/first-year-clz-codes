package basicsLearning;

interface Bird {
    public void fly();
}

interface wildAnimal {
    public void run();
}

public class hunting implements Bird, wildAnimal {

    public void fly(){
        System.out.println("birds fly away during hunting");
    }

    public void run(){
        System.out.println("animal run away during hunting");
    }

    public static void main(String[] args) {
        hunting bird1 = new hunting();
        bird1.fly();
        bird1.run();
    }
}


