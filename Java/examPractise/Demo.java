package examPractise;
public class Demo 
{
    long myLong;
    public static void main(String[] args) {
        // double Nooo = 10f * 10f; //here if enter f then no problem
        // float fla = (float) Nooo; //here no d canbe done compile error
        
        // int abcd = 100;
        // long ag = 34; abcd++; //long ma chei ja jpt huna mildeina
        // char lau= 29;
        // int lam = 'a';
        // double asjs = 'A';
        // // double da = "hh";
        // // int fahs = "dasd";
        // long asas = 'A';


        for (int y = 0;  y < 10; ++y)
        {
            if (y%2 != 0)
                System.out.println(y); break;
            
            
        }


        // //ternary
        // int a = 16;
        // int b = 5;
        // String c = String.valueOf((a > b) ? "no" : 100);
        // System.out.println(c.concat(" is a number."));

        // String str = a < b ? "yes 1 true vayo" : "false"; //first expresstion if true navaye last ko false
        // System.out.println(str);
        // // int abc;
        // // System.out.println(abc+"hello"); // this is compilation error
        // System.out.println(a++ - a++);
        // System.out.println(a);
        // System.out.println(++a - ++a);

        // // String str2 = "hello";
        // // str2 = "hello world";
        // // System.out.println(str2);

        // // long myLong;    
        // Demo myLong = new Demo();
        // System.out.println(myLong.myLong);    //default value 0L print

        int a = 1;
        while (a<=10){
            int mul = a * 5;
            System.out.printf("%d * %d = %d\n",5,a++,mul);
        }
            System.out.println(++a); 
    }
}