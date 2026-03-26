 import java.util.Scanner;

class SimpleInterest
{
    // Method to calculate Simple Interest
    static float calculateSI(float principal, float rate, float time)
    {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args)
    {
        float principal, rate, time, simpleInterest;
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Principal: ");
        principal = sc.nextFloat();

        System.out.print("Enter Rate of Interest: ");
        rate = sc.nextFloat();

        System.out.print("Enter Time: ");
        time = sc.nextFloat();

        // Calling method
        simpleInterest = calculateSI(principal, rate, time);

        // Output
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}