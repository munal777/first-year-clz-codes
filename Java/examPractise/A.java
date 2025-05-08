package examPractise;

public class A {
    int num = 10;
   int a;
   static int b;
   private int c;

   A(int a, int b)
   {
       System.out.println("may i involved");
        this.a = a;
        A.b = b;
   }
   A(int a, int b, int c)
   {
        this(a, b); // call first constructer
        this.c = c;
        System.out.println("first here");
   }

   void ohhMygod()
   {
    b = 20;
    System.out.println(b);
   }
   
public int getC() {
    return c;
}
public void setC(int c) {
    this.c = c;
}
// public static void main(String[] args) {
//     A obj = new A(1, 2, 10);
//     System.out.println(obj.a);
//     System.out.println(obj.b);
//     System.out.println(obj.c);
//    }
}

class B extends A 
{
    //making num here also
    int num = 20;

    int d;
    B(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
        System.out.println("Hello");
    }
    void display()
    {
        super.ohhMygod();
        d = super.a + A.b;
        System.out.println(d);
        super.setC(10);
        System.out.println(getC());
    }
    public static void main(String[] args) {
        B obj = new B(2, 3, 10, 20);
        //yha mero referance A class  vayo vane display ma error aauxa kina ki superclass lai display method xa vaenra thaha hudeina
        obj.display();
        System.out.println(obj.num);

        
        
    }
    
}