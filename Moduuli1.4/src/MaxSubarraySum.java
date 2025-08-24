import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Give the size of an array: ");
        int size = userInput.nextInt();
        int[] numbers = new int[size];
        int ints = 1;
        for (int i = 0; i < size; i++) {
            System.out.printf("Give %d. integer: ", ints);
            numbers[i] = userInput.nextInt();
            ints++;
        }
        System.out.println("The given array is: ");
        for (int ind = 0; ind < size; ind++) {
            System.out.print(" " + numbers[ind] + " ");
        }
        int startInd = 0;
        int endInd = 0;
        int biggestSum = numbers[0];
        // int[] numbers = {1, -2, 3, 5, -3, 2, -1, 2, -4, 6, -1, 4, -5, 2}; // A test array. Sum = 13, Index 3-12 (2-11 in coding)
        for (int i = 0; i < numbers.length; i++) { // Loop for the starting index
            // System.out.println("Start: " + numbers[i]);
            int sum = 0;
            for (int i2 = i; i2 < numbers.length; i2++) { // Loop for the ending index
                // System.out.println(numbers[i2]);
                sum += numbers[i2];
                // System.out.println(sum);
                if (sum > biggestSum) {
                    startInd = i;
                    endInd = i2;
                    biggestSum = sum;
                }
            }
        }
        System.out.println("\n\nThe biggest subarray sum is: " + biggestSum);
        System.out.println("It is from this subarray: ");
        for (int index = startInd; index <= endInd; index++) {
            System.out.print(" " + numbers[index] + " ");
        }
        System.out.println("\nFrom indexes " + (startInd + 1) + " to " + (endInd + 1));
    }
}
