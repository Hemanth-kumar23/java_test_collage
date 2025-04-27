
import java.util.Scanner;

public class WhileLoopExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The number from 1 to " + n + " ");
        int i = 1;

        // Using while loop to print numbers from 1 to N
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        sc.close();
    }
}
