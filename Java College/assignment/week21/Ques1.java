package assignment.week21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try 
        {
            System.out.println("Enter a integer: ");
            int a = scanner.nextInt();

            int b = scanner.nextInt();
            int c = a/b;
            
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter a Ingeter!!");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Canot divide by zero!");
        }
        finally
        {
            scanner.close();
        }
    }
    
}
