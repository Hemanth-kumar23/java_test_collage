
class Calculator {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }
}

class ResultPrinter {

    public static void printResult(int value) {
        System.out.println("The value is: " + value);
    }
}

class Class_Encapsulation {

    public static void main(String[] args) {
        int a = Calculator.add(20, 30);  // Addition: 20 + 30 = 50
        ResultPrinter.printResult(a);    // Output: "The value is: 50"

        int b = Calculator.sub(20, 10);  // Subtraction: 20 - 10 = 10
        ResultPrinter.printResult(b);    // Output: "The value is: 10"

        int c = Calculator.mul(10, 20);  // Multiplication: 10 * 20 = 200
        ResultPrinter.printResult(c);    // Output: "The value is: 200"

        int d = Calculator.div(20, 2);   // Division: 20 / 2 = 10
        ResultPrinter.printResult(d);    // Output: "The value is: 10"
    }
}
