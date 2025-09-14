import java.util.ArrayList;

public class SumThread extends Thread {

    private ArrayList<Integer> section;
    private int sum;

    public SumThread(ArrayList<Integer> section) {
        this.section = section;
    }

    public void run() {
        for (int i = 0; i < this.section.size(); i++) {
            this.sum += this.section.get(i);
        }
        Thread.yield();
    }

    public ArrayList<Integer> getSection() {
        return section;
    }

    public int getSum() {
        return this.sum;
    }
}
