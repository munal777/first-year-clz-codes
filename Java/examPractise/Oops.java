package examPractise;

public class Oops {
    private int a;
    private static int b;
    static int name;
    Oops(int a, int b)
    {
        this.a = a;
        // Oops.b = b; //yo yha thiyena vane b ko value 0 hunxa
        // b = Oops.b; // yesari hudeina
        
    }

    Oops()
    {
        name = 2000;
    }
    
    public static void main(String[] args) {
        Oops obj = new Oops(10, 5);
        System.out.println(obj.a);
        // System.out.println(Oops.b);  //static huda ni 0 nei hunxa kina ki concructer ma this/classs name le referance gareko xaena
        int store = Oops.b;
        System.out.println(store);

        Oops obj2 = new Oops(); //yo constructer nabani kina maile tala ko static ko variable ma 0 value nei pauxu
        System.out.println(Oops.name);

     }
}
