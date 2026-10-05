// public class JavaBasics {
//     public static void main(String[] args) {
//         int n = 526;
//         int rev = 0;

//         while (n > 0) {
//             int last_digit = n % 10;
//             rev = (rev * 10) + last_digit;
//             n = n/10;
//         }
//         System.out.println(rev);
//     }
// }

import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUmber");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            int last_digit = n % 10;
            rev = (rev * 10) + last_digit;
            n = n/10;

        }
        System.out.println(rev);
    }
}