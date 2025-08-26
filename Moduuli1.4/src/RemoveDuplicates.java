import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Give the size of an array: ");
        int size = userInput.nextInt();

        int[] nums = new int[size];

        int ints = 1;
        for (int i = 0; i < size; i++) {
            System.out.printf("Give %d. integer: ", ints);
            nums[i] = userInput.nextInt();
            ints++;
        }

        System.out.println("The given array is: ");
        for (int ind = 0; ind < size; ind++) {
            System.out.print(" " + nums[ind] + " ");
        }

        int[] noDups = new int[nums.length]; // Collect the numbers to this array.

        int collected = 0;

        for (int i = 0; i < nums.length; i++) { // Take a number from the nums array.
            boolean dublicate = false;
            if (i == 0) {  // If it is the first number, it cannot be a duplicate --> Add it to the new noDups array.
                noDups[0] = nums[i];
                collected++; // One number added to the new array.
            } else {
                for (int i2 = 0; i2 < collected; i2++) { // Iterate through the noDups array to see if the current number from the nums array matches with any of them.
                    if (noDups[i2] == nums[i]) { // If it does...
                        dublicate = true; // A duplicate was found.
                        break; // No need to check the rest of noDups array. Break away from this loop.
                    }
                }
                if (!dublicate) { // Check if a duplicate was found for the current number from the nums array. If not...
                    noDups[collected] = nums[i]; // Add the current number to the noDups array.
                    collected++; // One number added to the new array.
                }
            }
        }

        System.out.println("\n\nHere is the array without duplicates: ");
        for (int show = 0; show < collected; show++) {
            System.out.print(" " + noDups[show] + " ");
        }
    }
}
