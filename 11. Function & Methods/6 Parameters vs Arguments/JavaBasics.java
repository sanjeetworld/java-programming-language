import java.util.*;
public class JavaBasics {
    public static int CalculateSum(int a, int b) {  // parameter or formal parameter
        int sum = a + b;
        return sum;
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);  // argument or actual parameter
        System.out.println("Sum is : " + sum);
    }
}