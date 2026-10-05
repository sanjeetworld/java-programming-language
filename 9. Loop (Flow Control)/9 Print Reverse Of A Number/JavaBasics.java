import java.util.*;
public class JavaBasics {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();

        while (number > 0) {
            int last_digit = number % 10;
            System.out.print(last_digit);
            number = number /10;
        }
        System.out.println();
    }
}
