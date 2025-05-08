package basicsLearning;

public class foodMain {
    public static void main(String[] args) {
        Food food1 = new Food("pizza");
        Food food2 = new Food("burger");
        Food food3 = new Food("pasta");

        Food[] cafe={food1,food2,food3};

        System.out.println(cafe[1].food);


    }
}
