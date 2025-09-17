public class ArrayListEditor implements Runnable{

    private static int count;
    private int id;
    private ArrayListInstance theArrayList;
    private String element;

    public ArrayListEditor(ArrayListInstance theArrayList, String element) {
        count++;
        this.id = count;
        this.theArrayList = theArrayList;
        this.element = element;
    }

    public void run() {
        for (int i = 0; i < 20; i++) { // Add 20 elements to the list
            theArrayList.addAnElement(element);
            //System.out.println("Editor " + this.id + " added an element.");
        }
        System.out.println("Editor " + this.id + " - ArrayList size after adding elements: " + theArrayList.getArrayListSize());

        for (int i = 0; i < 10; i++) { // Remove 10 elements from the list
            theArrayList.removeAnElement(element);
            //System.out.println("Editor " + this.id + " removed an element.");
        }
        System.out.println("Editor " + this.id + " - ArrayList size after removing elements: " + theArrayList.getArrayListSize());

    }

}
