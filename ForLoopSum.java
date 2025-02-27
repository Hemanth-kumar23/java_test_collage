
import java.util.Scanner; // Import Scanner class

public class ForLoopSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Take user input

        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        // Close Scanner
    }
}
