package basicsLearning;
import java.util.Scanner;

public class PrimeNum2 {
    public static void Prime()
    {
        System.out.print("Enter a Num: ");
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean prime =  true;
        // int count = 0;
        for(int i=2;  i<num; i++)
        {
            if(num%i == 0)
            {
                prime = false;
            }
        }
        if(prime)
        {
            System.out.println("Prime Number.");
        }
        else
        {
            System.out.println("Not a prime Number.");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        PrimeNum2.Prime();
    }
}
