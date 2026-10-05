/* Question 1 : How many times 'Hello' is printed? */

// public class JavaBasics {
//     public static void main(String[] args){
//         for(int i=0; i<5; i++) {
//         System.out.println("Hello");
//         i+=2;
//         }
//     }
// }

/* Question2: Write a program that reads a set of integers,and then prints the sum of the
even and odd integers. */

// import java.util.*;
// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int set = sc.nextInt();
//         int even = 0;
//         int odd = 0;
//         do { 
//             int last_digit = set % 10;
//                 if (last_digit % 2 == 0) {
//                     even += last_digit;
//                 }
//                 else{
//                     odd += last_digit;
//                 }
//                 set = set/10;
            
//         } while (set != 0);
//         System.out.println("Total Even sum :" + even);
//         System.out.println("Total Odd sum :" + odd);
//     }
// }

/* Question 3 :Write a program to find the factorial of any number entered by the user. */

// import java.util.*;
// public class JavaBasic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number :");
//         int n = sc.nextInt();
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }
//         System.out.println("Factrial : " + fact);
//     }
// }


/*Question4: Write a program to print the multiplication table of a number N,entered by the
user.*/


// import java.util.*;
// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number : ");
//         int n = sc.nextInt();
//         for(int i = 1; i <= 10; i++) {
//             int table = n * i;
//             System.out.println(table);
//         }
//         System.out.println("This is final table");
//     }
// }


/*Question 5 : What is wrong in the following program?*/

public class BasicsJava {
    public static void main(String args[]) {
        for(int i = 0; i <= 5; i++ ) {
            System.out.println("i = " + i );
        }
        System.out.println("i after the loop = " + i );
    }
}

/*Variable i cannot be accessed outside the for loop because its scope is limited to the loop.*/