// import java.util.*;
// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         do { 
//             System.out.println("Enter your number : ");
//             int Number = sc.nextInt();
//             if (Number % 10 == 0) {
//                 continue;
//             }
//             System.out.println("Enter was NUmber : " + Number);
//         } while (true);
//     }
// }

import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number : "); 
            int number = sc.nextInt();
             if (number % 10 == 0) {
                continue;
             }
             System.out.println("Your Enter Number was : ");
             System.out.println(number);
        } while (true);
    }
}