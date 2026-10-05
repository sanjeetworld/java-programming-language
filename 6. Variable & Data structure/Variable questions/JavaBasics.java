/*Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)*/

// import java.util.*;
// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a :");
//         int a = sc.nextInt();
//         System.out.println("ENter b :");
//         int b = sc.nextInt();
//         System.out.println("Enter c :");
//         int c = sc.nextInt();
//         System.out.println("Average :");
//         int AVG = (a+b+c)/3;
//         System.out.println(AVG);
//     }
// }


/*Question 2: In a program, input the side of a square. You have to output the area of the
square.
(Hint : area of a square is (side x side))*/


// import java.util.*;
// public class JavaBsics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter side :");
//         float side = sc.nextFloat();
//         System.out.println("Area :");
//         float area = side * side;
//         System.out.println(area);
//     }
// }

/*Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/

// import java.util.*;
// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter Pencil Price :");
//         float pencil = sc.nextFloat();
//         System.out.println("Eneter Pen Price :");
//         float pen = sc.nextFloat();
//         System.out.println("Enter Eraser Price :");
//         float eraser = sc.nextFloat();
//         System.out.println("Total amount :");
//         float price = pencil + pen + eraser;
//         System.out.println(price);
//         System.out.println("Total Amount Included GST");
//         float Amount = (price*18)/100;
//         float Final_Amount = price + Amount;
//         System.out.println(Final_Amount);
//     }
// }

/* Question 4: What will be the type of result in the following Java code? */


public class JavaBasics {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f*b) + (i%c) - (d*s);
        System.out.println(result);
    }
}




/*Question 5: (Advanced) Will the following statement give any error in Java?
int $ = 24*/