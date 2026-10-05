/*Question1: Write a Java program to get a number from the user and print whether it is
positive or negative.*/

// import java.util.*;
// public class JavaBasics {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         if (number > 0) {
//             System.out.println("Given number is Postive");
//         }
//         else {
//             System.out.println("The given number is Negative");
//         }
//     }
// }

/* Question2: Finish the following code so that it prints You havea fever if your temperature
is above 100 and otherwise prints You don't have a fever */

// import java.util.*;
// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float temp = sc.nextFloat();
//         if (temp >= 100) {
//             System.out.println("You have Fever");
//         }
//         else {
//             System.out.println("You have not Fever");
//         }
//     }
// }

/*Question3: Write a Java program to input week number (1-7) and print day of week name
using switch case.*/

// import java.util.*;
// public class JavaBasics {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         switch(number) {
//             case 1 : System.out.println("Monday");
//              break;
//             case 2 : System.out.println("Tuesday");
//              break;
//             case 3 : System.out.println("Wednesday");
//             break;
//             case 4 : System.out.println("Thursday");
//             break;
//             case 5 : System.out.println("Friday");
//             break;
//             case 6 : System.out.println("Saturday");
//             break;
//             case 7 : System.out.println("Sunday");
//             default : System.out.println("Entered number is invalid");
//         }
//     }
// }

/* Question 4 :What will be the value of x & y in thefollowing program: */

// public class JavaBasics {
//     public static void main(String args[]) {
//         int a = 63, b = 36;
//         boolean x = (a < b ) ? true : false;
//         int y= (a > b ) ? a : b;
//         System.out.println(x);
//         System.out.println(y);
//     }
// }

/*  Question5: Write a Java program that takes a year from the user and print whether that year is a leap year or not. */

import java.util.*;
public class JavaBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int leap = year % 4;
        if (leap == 0) {
            System.out.println("This year is leap year");
        }
        else {
           System.out.println("This year is not leap year");
        }
    }
}