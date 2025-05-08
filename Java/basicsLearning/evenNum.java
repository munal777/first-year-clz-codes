package basicsLearning;

public class evenNum {

    public static void main(String[] args) {
        // for(int i=1; i<=10; i++)
        // {
        //     int evenNum = 2 * i;
        //     System.out.println(evenNum);
        // }

        // int num = 5;
        // int a=0;
        // int b=1;
        // for(int i=1; i<=num; i++)
        // {
        //     int sum=a+b;
        //     a = b;
        //     b = sum;
        //     System.out.print(a+" ");
        // }

        int a = 5;
        // int b = 4;
        // while (b != 0)
        // {
        //     int rem=a%b;
        //     a = b;
        //     b = rem;
        // }

        // System.out.println(a);
            int factorial=1;
        for(int i=1; i<=a; i++)
        {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}