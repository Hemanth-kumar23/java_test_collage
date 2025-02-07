
public class methodp {

    // Method that takes two parameters and returns their sum
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        methodp calc = new methodp(); // Creating an object
        System.out.println("Sum: " + calc.add(5, 10)); // Calling method with arguments
    }
}
