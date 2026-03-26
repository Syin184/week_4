import java.util.Scanner;

class CombinedProgram
{
    // Method to calculate handshakes
    static int calculateHandshakes(int n)
    {
        return (n * (n - 1)) / 2;
    }

    // Method to calculate rounds
    static double calculateRounds(double a, double b, double c)
    {
        double perimeter = a + b + c;
        return 5000 / perimeter; // 5 km = 5000 meters
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // ---- Handshakes ----
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum number of handshakes: " + handshakes);

        // ---- Athlete ----
        System.out.print("\nEnter side 1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double s2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double s3 = sc.nextDouble();

        double rounds = calculateRounds(s1, s2, s3);
        System.out.println("Number of rounds needed: " + rounds);
    }
}