
public class staic {

    static int count = 0; // Static variable shared by all objects

    // Constructor that increases count whenever an object is created
    staic() {
        count++;
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        new staic(); // Object 1 → count = 1
        new staic(); // Object 2 → count = 2
    }
}
