 import java.util.Scanner;

class AthleteRun
{
    // Method to calculate rounds
    static double calculateRounds(double a, double b, double c)
    {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter side 1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double s2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double s3 = sc.nextDouble();

        // Calling method
        double rounds = calculateRounds(s1, s2, s3);

        // Output
        System.out.println("Number of rounds needed to complete 5 km run: " + rounds);
    }
}