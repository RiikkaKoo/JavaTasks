/* Task 2: Parallel Number Summation

Create a Java program that calculates the sum of numbers from an array in parallel using multiple threads.
In this exercise, each thread calculates the sum of a portion of the numbers. Hint: Generate first
an array of, e.g., 100000, random integer numbers. Then check how many processor cores you have
in your computer (Runtime.getRuntime().availableProcessors()), and divide the array to
so many equal sized portions that are given to separate threads to calculate the sum.

 */

import java.util.ArrayList;

public class ParellelSum {
    private final static int NUMS = 112000; // With fewer numbers, it makes no sense to use multiple Threads. It's quicker to do it in one.

    private static void doTheSum(int[] numbers, int cores) {

        ArrayList<SumThread> allSumThreads = new ArrayList<>(); // Collect all the threads here.

        double sectionSize = (double) NUMS /cores;
        //System.out.println("The section size: " + NUMS + "/" + cores + " = " + sectionSize);

        int startIndex = 0;
        int check = 0;

        for (int i = 0; i < cores; i++) { // Split the numbers for the cores to handle
            ArrayList<Integer> sectionNumbers = new ArrayList<>();
            if (i < (cores - 1)) { // Every thread gets the same amount of numbers except the last one.
                for (int j = startIndex; j < (int)(startIndex + sectionSize); j++) {
                    sectionNumbers.add(numbers[j]);
                }
                SumThread thread = new SumThread(sectionNumbers); // Add the new thread to the list of threads.
                allSumThreads.add(thread);
                startIndex += (int) sectionSize; // The startIndex for the next section

                //System.out.println(thread.getSection().size()); // These comments ae here to check that all the numbers were split correctly.
                //check += thread.getSection().size();

            } else { // The last thread gets the remaining numbers (more than the rest)
                for (int j = startIndex; j < numbers.length; j++) {
                    sectionNumbers.add(numbers[j]);
                }
                SumThread thread = new SumThread(sectionNumbers);
                allSumThreads.add(thread);

                //System.out.println(thread.getSection().size());
                //check += thread.getSection().size();
            }
        }
        //System.out.println("Numbers total: " + NUMS + ", Section size sum: " + check); // To check that all the numbers were divided

        // START THE THREADS:
        long startTime = System.nanoTime();
        for (SumThread st : allSumThreads) { // Iterate through the list of threads.
            st.start();
        }

        int totalSum = 0;

        for (SumThread st : allSumThreads) {
            try {
                st.join(); // Wait for the threads to finish
                totalSum += st.getSum(); // Get sum the thread counted.
                //System.out.println("Thread sum: " + st.getSum());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        long endTime = System.nanoTime();
        System.out.println("The total sum of the numbers: " + totalSum);
        double time = (endTime-startTime)/(Math.pow(10,6)); // Nanoseconds to milliseconds
        System.out.printf("Time taken: " + time + " ms. \n", time);
    }

    public static void main(String[] args) { // It is best to run this a few times to get more clear results

        int[] theNumbers = new int[NUMS];

        for (int i = 0; i < NUMS; i++) {
            theNumbers[i] = (int) (Math.random()*10+1);
            //System.out.println(theNumbers[i]);
        }

        System.out.println("\nCount " + NUMS + " numbers together.");

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("System has " + cores + " cores.");

        System.out.println("\nWITH 2 CORES: ");
        doTheSum(theNumbers, 2);
        System.out.println("\nWITH " + cores + " CORES: ");
        doTheSum(theNumbers, cores);

    }
}
