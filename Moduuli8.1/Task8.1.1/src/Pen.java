public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    private Color color;
    boolean capIsOn = true;

    public Pen() {
        this.color = Color.RED; // Default colour
    }

    public Pen(Color color) {
        this.color = color; // Set a specific starting colour for the pen.
    }

    public String draw() {
        if (!capIsOn) {
            return "Drawing " + color.toString();
        }
        return "";
    }

    public void capOff() {
        if (capIsOn) {
            this.capIsOn = false;
        }
    }

    public void capOn() {
        if (!capIsOn) {
            this.capIsOn = true;
        }
    }

    public void changeColor(Color color) {
        if (capIsOn) {
            this.color = color;
        }
    }
}
