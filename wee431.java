 import java.util.*;

public class wee431 {

    // Method to find sum
    static int findSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // Method to find mean
    static double findMean(int[] arr) {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }

    // Method to find shortest height
    static int findShortest(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    // Method to find tallest height
    static int findTallest(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }

        System.out.println("Player Heights:");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\nSum of Heights = " + sum);
        System.out.println("Mean Height = " + mean);
        System.out.println("Shortest Height = " + shortest);
        System.out.println("Tallest Height = " + tallest);
    }
}