import java.util.*;
public class JavaBasics {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int Age = sc.nextInt();
        if (Age >= 18) {
            System.out.println("You are eligible for vote and also drive vehicle");
        }
        else if (Age >= 13 && Age < 18) {
            System.out.println("You are teenager");
        }
        else {
            System.out.println("You are not eligible for vote and also can not drive vehicle");
        }
    }
}