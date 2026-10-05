// public class JavBasics {
//     public static void main (String[] args) {
//         int n = 20;
//         int i = 1;
//         int sum = 0;
//         while(i < n) {
//             sum += i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }

import java.util.*;
public class JavaBasics {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
         int i = 1;
        
        while (i < number) {
            sum += i;
             i++;
        }
        System.out.println(sum);
    }
}