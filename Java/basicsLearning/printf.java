package basicsLearning;

public class printf {
    public static void main(String[] args) {

        //printf = % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = 'A';
        String myString = "Munal";
        int myInt = 7;
        double myDouble = 10000000;

        // [conversion-character]
        System.out.printf("%b",myBoolean);
        System.out.printf("%d",myInt);
        System.out.printf("%c",myChar);
        System.out.printf("%s",myString);
        System.out.printf("%f",myDouble);

        //[width- it is given %2 gave 2 character space & 5 give 5 charater space]
        // System.out.printf("%d X%2d =%5d",myInt,myInt,myInt);

        //[precision- To set a digits after dot in float & double .2 will allow .00 ]
        // System.out.printf("%.2f",myDouble);

        //[flags]
        // System.out.printf("%+,.2f",myDouble);


    }
}
