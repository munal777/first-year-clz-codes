package basicsLearning;
import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Calculate the GCD using the Euclidean algorithm
        int gcd = findGCD(a, b);

        // Display the result
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);

        // Close the scanner
        scanner.close();
    }

    // Method to find the GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
            while (b != 0) {
                int r = a % b; // Compute the remainder
                a = b;         // Assign the value of b to a
                b = r;         // Assign the value of r to b
            }
        return a; 
    }
    
}

