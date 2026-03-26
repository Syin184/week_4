import java.util.*;

public class wee422
 {

    // Method using recursion
    static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    // Method using formula
    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if input is natural number
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
            return;
        }

        int sumRec = recursiveSum(n);
        int sumFormula = formulaSum(n);

        System.out.println("Sum using Recursion = " + sumRec);
        System.out.println("Sum using Formula = " + sumFormula);

        // Compare results
        if (sumRec == sumFormula) {
            System.out.println("Both results are correct");
        } else {
            System.out.println("Results do not match");
        }
    }
}