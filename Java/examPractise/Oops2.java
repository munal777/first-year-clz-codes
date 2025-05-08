package examPractise;

abstract class Oops2 {
    String bankname;
    Oops2(String bankname, int hour)
    {
        this.bankname = bankname;
        // System.out.println("this is "+bankname);
    }

}

class XYZ extends Oops2
{
    // two way to deleared
    XYZ()
    {
        super("xis bank",8);  //delearing the bankname of parent class name
    }

    // XYZ(String bankname, int hour)
    // {
    //     super(bankname, hour);
    // }
    
    
    public static void main(String[] args) {

    Oops2 obj = new XYZ(); //class vitra object banaununu milxa kunei method ma hunu parxa vanne hudeina
    System.out.println(obj.bankname);
}
    // public abstract double num();
}