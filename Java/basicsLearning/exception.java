package basicsLearning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            int x = scanner.nextInt();

            System.out.println("Enter second number: ");
            int y = scanner.nextInt();

            int z = x/y;
            System.out.println("Result: " + z);

        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a number");
        }
        finally {
            scanner.close();;
        }

        try {
        int[] numArray = {1,6,5,3,7};
        System.out.println(numArray[8]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" you are trying to access array which is out of index.");
        }
    }
}
