import java.util.*;
public class JavaBasics {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if (A%2 == 0) {
            System.out.println("The given number is EVEN");
        }
        else{
            System.out.println("The given number is ODD");
        }
    }
}