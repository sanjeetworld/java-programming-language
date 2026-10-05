// import java.util.*;
// public class JavaBasics {
//     public static void main(String[] args) {
//         System.out.println("Enter your Income");
//         Scanner sc = new Scanner(System.in);
//         float Income = sc.nextFloat();
//         if (Income <= 500000) {
//             System.out.println("Your total tax is Zero");
//         }
//         else if ( Income < 500000 && Income >= 1000000) {
//             double Tax = Income * (0.2);
//             System.out.println("Your Total Tax is :" + Tax);
//         }
//         else {
//             double Tax = Income * (0.3);
//             System.out.println("Your total tax is : " + Tax);
//         }
//     }
// }

import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Income");
        int income = sc.nextInt();

        int tax;

        if (income < 500000) {
            tax = 0;
        }
        else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        }
        else {
            tax = (int) (income * 0.3);
        }

        System.out.println("your tax is : " + tax);
    }
}