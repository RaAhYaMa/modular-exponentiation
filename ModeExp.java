import java.util.Scanner;

public class ModeExp {
    static int ExpBiner(int b, int m, int n) {
        int x = 1;
        int power = b % m;
        while (n > 0) {
            if (n % 2 == 1) {
                x = (x * power) % m;
            }
            power = (power * power) % m;
            n = n / 2;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int b = input.nextInt();

        System.out.println("Enter the mod");
        int m = input.nextInt();

        System.out.println("Enter the exponentiation");
        int n = input.nextInt();

        input.close();

        int result = ExpBiner(b, m, n);

        System.out.println("The result of " + b + "^" + n + " mod " + m + " is " + result);
    }
}