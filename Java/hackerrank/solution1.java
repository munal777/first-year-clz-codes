package hackerrank;

import java.util.Scanner;

public class solution1 {
    public static void main(String[] args) {

        // System.out.print("Enter num here: ");

        Scanner userNum = new Scanner(System.in);
        
        int n = userNum.nextInt();

        if (n % 2 != 0) 
        {
            System.out.println("weird");
        }
        else if (n >= 2 && n <=5)
        {
            System.out.println("not weird");
        }
        else if (n >= 6 && n <=20)
        {
            System.out.println("weird");
        }
        else if (n > 20 && n % 2 == 0)
        {
            System.out.println("not weird");
        }

        userNum.close();
    }
}
