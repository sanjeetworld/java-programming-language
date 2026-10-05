/* Question 1 : Write a Java method to compute the average of three numbers.. */

// public class JavaBasics {
//     public static int avg(int a, int b, int c) {
//         int avg = (a + b + c) / 3;
//         return avg;
//     }
//     public static void main(String args[]) {
//         System.out.println(avg(5,4,3));
//     }
// }

/* Question 2 : Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method. */

// public class JavaBasics {
//     public static boolean isEven(int n) {
//         // boolean isEven = true;            //not usable
//         if (n%2 == 0) {
//             return true;
//         }
//         return false;
//     }
//     public static void main(String args[]) {
//        System.out.println(isEven(7));
//     }
// }


/* Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A numberis called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321. */

// public class JavaBasics {
//     public static void palindrome(int n){
//         int original = n;
//         int RevNum = 0;
//         while(n>0) {
//             int lastdigit = n % 10;
//             RevNum = RevNum*10 + (lastdigit);    // we face some difficulty to make the logic
//             n = n/10;
//         }
//         if (original == RevNum){
//             System.out.println("NUmber is Palindrome");
//         }
//         else{
//             System.out.println("NUmber is Not Palindrome");
//         }
//     }
//     public static void main(String args[]) {
//      palindrome(121);
//     }
// }



/* Question 4 : READ & CODE EXERCISE
Search about(Google) & use the following methods of the Math class in Java:
a. Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs( ) */


// public class JavaBasics {

             //min number find

    // public static int minNum(int a, int b) {
    //     int minNum = Math.min(a,b);
    //     return minNum;
    // }
    // public static void main(String args[]) {
    //     System.out.println(minNum(5,7));
    // }
                  // Maximum Number Find

    // public static int maxNum(int a, int b) {
    //     int maxNum = Math.max(a,b);
    //     return maxNum;
    // }
    // public static void main(String args[]) {
    //     System.out.println(maxNum(3,1));
    // }

                 //Squire root find out

    // public static double SqrRoot(int n) {
    //     double SqrRoot = Math.sqrt(n);
    //     return SqrRoot;    
    // }
    // public static void main(String args[]) {
    //     System.out.println(SqrRoot(8));
    // }

                     // calculate power

    // public static int power(int a, int b) {
    //     int power = (int)Math.pow(a, b);
    //     return power;
    // }
    // public static void main(String args[]) {
    //     System.out.println(power(4, 2));
    // }



                  //Average of given number

    // public static int average(int n) {
    //     int average = Math.avg(n);         // we don't have any avg function
    //     return average;
    // }
    // public static void main(String args[]) {
    //     System.out.println(average(9));
    // }


                            // Math.abs( ) to find out absolute value


    // public static int absolute(int n) {
    //     int absolute = Math.abs(n);
    //     return absolute;
    // }
    // public static void main(String args[]) {
    //     System.out.println(absolute(-6));
    // }

// }   



/* Question 5 :
Write a Java method to compute the sum of the digits in an integer. */


public class JavaBasics {
    public static int sum (int n) {
        int sum = 0;
        while(n > 0) {
            int lastdigit = n%10;
            sum = sum + lastdigit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String args[]) {
        System.out.println(sum(12349));
    }
}