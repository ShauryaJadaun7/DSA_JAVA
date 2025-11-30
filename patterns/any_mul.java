import java.util.Scanner;

public class any_mul {

    // Function to get product of a single digit and a number in base b
    public static int getProductWithSingleDigit(int b, int n1, int d2) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int d = d1 * d2 + c;
            c = d / b;
            d = d % b;

            rv += d * p;
            p *= 10;
        }
        return rv;
    }

    // Function to add two numbers in base b
    public static int getSum(int b, int n1, int n2) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            n1 /= 10;
            n2 /= 10;

            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;

            rv += d * p;
            p *= 10;
        }
        return rv;
    }

    // Main function for any base multiplication
    public static int getProduct(int b, int n1, int n2) {
        int rv = 0;
        int p = 1;

        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int singleProduct = getProductWithSingleDigit(b, n1, d2);
            rv = getSum(b, rv, singleProduct * p);
            p *= 10;
        }

        return rv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int b = sc.nextInt();
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();

        int result = getProduct(b, n1, n2);
        System.out.println("Product in base " + b + " is: " + result);
    }
}
