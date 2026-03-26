import java.util.*;

public class CombinedProgram {

    // Method to get factors
    static int[] getFactors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Sum of factors
    static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // Product of factors
    static int getProduct(int[] arr) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product;
    }

    // Sum of squares
    static double getSumOfSquares(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    // Recursive sum of n natural numbers
    static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1: Factors
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.println("Factors are:");
        for (int i : factors) {
            System.out.print(i + " ");
        }

        System.out.println("\nSum = " + getSum(factors));
        System.out.println("Product = " + getProduct(factors));
        System.out.println("Sum of Squares = " + getSumOfSquares(factors));

        // Part 2: Sum of n natural numbers
        System.out.print("\nEnter n: ");
        int n = sc.nextInt();

        int sumRec = recursiveSum(n);
        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using Recursion = " + sumRec);
        System.out.println("Sum using Formula = " + sumFormula);

        if (sumRec == sumFormula) {
            System.out.println("Both results are correct");
        } else {
            System.out.println("Results do not match");
        }
    }
}