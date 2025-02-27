
import java.util.Scanner;

public class WhileLoopExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;

        // Using while loop to print numbers from 1 to N
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}
