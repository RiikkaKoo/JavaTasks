/*Assuming ArrayList is not thread-safe, design a class that has methods
for adding an element to an ArrayList collection, querying the size of
the collection, and removing an element from the collection. The elements
may be any objects of your choice, such as Strings. The class you design should
be thread-safe. Design a class that you can use to test thread-safety of your class.
 */

public class Main {
    public static void main(String[] args) {
        int n = 0;

        while (n < 10) { // Do the test for 10 times
            ArrayListInstance arrayListInstance = new ArrayListInstance();

            Thread editor1 = new Thread(new ArrayListEditor(arrayListInstance, "First"));
            Thread editor2 = new Thread(new ArrayListEditor(arrayListInstance, "Second"));
            Thread editor3 = new Thread(new ArrayListEditor(arrayListInstance, "Third"));

            editor1.start();
            editor2.start();
            editor3.start();

            try {
                editor1.join();
                editor2.join();
                editor3.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("\nThe final size of the array: " + arrayListInstance.getArrayListSize() + "\n-----------------------------------------------");
            System.out.println();
            n++;
        }
    }
}
