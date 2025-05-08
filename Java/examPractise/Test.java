package examPractise;

interface Aone{
    void method();
}

abstract class One{
    public void method()
    {
        System.out.println("Hello");
    }

    abstract void myFire();
}

class Two extends One implements Aone 
{
    // public void method()
    // {

    // }
    public void myFire()
    {
        
    }
}

public class Test extends Two
{
    public static void main(String[] args) {
        Aone a = new Two();
        a.method();
        System.out.println("13"+5+3);

        
    }
}