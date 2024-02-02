import java.util.Scanner;

public class ModeExpRec {

    // Recursive function to calculate binary exponentiation
    static int ExpBiner(int b, int m, int n, int x) {
        // Base case: if the exponent is 0, return the accumulated result
        if (n == 0) {
            return x;
        } else {
            // Calculate the power modulo m
            int power = b % m;

            // Check if the exponent is even or odd
            if (n % 2 == 0) {
                // If even, recursively call with halved exponent and squared power
                return ExpBiner(power * power, m, n / 2, x);
            } else {
                // If odd, recursively call with halved exponent, squared power, and updated accumulation
                return ExpBiner(power * power, m, n / 2, (x * power % m));
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the base number
        System.out.println("Enter the base number");
        int b = input.nextInt();

        // Input the modulus
        System.out.println("Enter the modulus");
        int m = input.nextInt();

        // Input the exponent
        System.out.println("Enter the exponentiation");
        int n = input.nextInt();

        input.close();

        // Check for negative exponent
        if (n < 0) {
            System.out.println("Not available for negative exponent");
        } else {
            // Calculate and print the result
            int result = ExpBiner(b, m, n, 1);
            System.out.println("The result of " + b + "^" + n + " mod " + m + " is " + result);
        }
    }
}