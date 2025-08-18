public class Cats {
    private String name;

    public Cats(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Cats cat1 = new Cats("Whiskers");
        Cats cat2 = new Cats("Rex");

        // Call the meow method on the cat instance
        cat1.meow();
        cat1.meow();
        cat2.meow();
        cat1.meow();

    }
}
