
public class BoxingUnboxingDemo {

    public static void main(String[] args) {

        // Boxing: converting primitive to object
        int a = 10;
        Integer boxedA = Integer.valueOf(a);
        System.out.println("Boxed value: " + boxedA);

        // Unboxing: converting object to primitive
        Integer b = 20;
        int unboxedB = b.intValue();
        System.out.println("Unboxed value: " + unboxedB);
    }
}
