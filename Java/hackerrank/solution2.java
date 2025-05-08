package hackerrank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class solution2 {
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
        try {
            String strX = scanner.next();
            String strY = scanner.next();
            long x,y;
            try {
                x = Integer.parseInt(strX);
            }
            catch (NumberFormatException e)
            {
                System.out.println("java.util.InputMismatchException");
                return;
            }
            try {
                y = Integer.parseInt(strY);
            }
            catch (NumberFormatException e) 
            {
                System.out.println("java.util.InputMismatchException");
                return;
            }
            System.out.println(x/y);
        }
        catch (InputMismatchException e)
        {
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            scanner.close();
        }
    }
}
