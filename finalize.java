
public class finalize {

    protected void finalize() {
        System.out.println("Object is being garbage collected");
    }

    public static void main(String[] args) {
        finalize obj = new finalize();
        obj = null; // Making object eligible for garbage collection
        System.gc(); // Requesting garbage collection
    }
}
