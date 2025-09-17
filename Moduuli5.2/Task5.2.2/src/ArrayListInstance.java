import java.util.ArrayList;

public class ArrayListInstance {

    private ArrayList<String>  arrayList = new ArrayList<>();

    public synchronized void addAnElement(String element) {
        arrayList.add(element);
    }

    public synchronized boolean removeAnElement(String element) {
        return arrayList.remove(element);
    }

    public synchronized int getArrayListSize() {
        return arrayList.size();
    }
}
