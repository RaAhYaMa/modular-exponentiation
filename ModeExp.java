import java.util.Scanner;

public class ModeExp {

    // Function to calculate binary exponentiation
    static int ExpBiner(int b, int m, int n) {
        int x = 1;
        int power = b % m;

        int cnt = 0;

        // Binary exponentiation algorithm
        while (n > 0) {
            if (n % 2 == 1) {
                x = (x * power) % m;
            }
            power = (power * power) % m;

            // Output the iteration
            System.out.println("Bit ke-" + cnt + " (dari kanan) dari n-binary adalah " + n % 2 + ". Maka, x = " + x + " dan power = " + power);

            n = n / 2;
            cnt++;
        }
        return x;
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
            int result = ExpBiner(b, m, n);
            System.out.println("The result of " + b + "^" + n + " mod " + m + " is " + result);
        }
    }
}