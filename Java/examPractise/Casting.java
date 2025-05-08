package examPractise;

class One1
{
    void myRun()
    {
        System.out.println("One1");
    }
}
class Two2 extends One1
{
    void myRun()
    {
        System.out.println("Two2 run");
    }
    void eat()
    {
        System.out.println("2 eat");
    }
}
class Three3 extends One1
{
    void myRun()
    {
        System.out.println("Three3  run");
    }
     void walk()
    {
        System.out.println("3 walk");;
    }
}
class Casting {

    public static void main(String[] args) {
        One1 a = new Two2();
        // a.myRun();  //upcasting dog to animal
        // a.eat();  //compiling error

        // Two2 b = (Two2) a;
        // b.eat();   //downcasting animal to dog
        // b.myRun();

        One1 x = new One1();
        // x.myRun();; 
        

        // Two2 y = (Two2) x;
        // y.eat();  //yo downcasting garda runtime error aauxa jaba parenet class le parent lai nei reference garxa

        // Three3 z = (Three3) y;
        // z.walk(); //yo ni hunxa maile two bata garda

        if (a instanceof Two2)
        {
            Two2 b = (Two2) a;
            b.eat();
        }
        if (x instanceof Three3) 
        {
            Three3 z = (Three3) x;
            z.walk();
            z.myRun();
        }

        
        

        // byte b = 50;
        // b = (byte)(b * 50);
        // System.out.println(b);

        // int xz = 'c';b++;
        // byte as = 12;
        // // System.out.println(az);  //print  chei hudeina 

        // char emji = 7;
        // System.out.println(emji);

        // double num1= (long) 10.56;
        // int avg = (int) 20.25;
        // System.out.println(num1 + avg);   
    }
}