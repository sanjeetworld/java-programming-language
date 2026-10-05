import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter A :");
        int A = sc.nextInt();
        System.out.println("Enter B");
        int B = sc.nextInt();

        System.out.println("Enter operator");
        String Operator = sc.next();
        System.out.println("Your final Ans :");
        switch(Operator) {
            case "+" : System.out.println(A + B);
            break;
            case "-" : System.out.println(A - B);
            break;
            case "*" : System.out.println(A * B);
            break;
            case "%" : System.out.println(A % B);
            break;
            default : System.out.println("Enter valid Operator");
        }
    }
}
