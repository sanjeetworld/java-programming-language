import java.util.*;
public class JavaBasics {
    public static int multiply(int a, int b) {
        int multiple = a * b;
        return multiple;
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiple = multiply(a, b);
        System.out.println("Multiply : " + multiple);
    }
}