// public class Pattern {
//     public static void butterfly(int n) {
//         for (int i=1; i<=n; i++) {

//             //Star i

//             for (int j =1; j<=i; j++) {
//                 System.out.print("*");
//             }

//             //Space 2*(n-i)

//             for (int j=1; j<=2*(n-i); j++) {
//                     System.out.print(" ");
//             }

//             //Star i

//             for(int j= 1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = n; i >= 1; i--) {
//             //Star i
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             //Space 2*(n-i)
//             for (int j = 1; j <= 2*(n-i); j++) {
//                 System.out.print(" ");
//             }
//             //Start i
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]) {
//         butterfly(8);
//     }
// }

public class Pattern {
    public static void butterfly(int n) {
        //outer Loop
        for (int i =1; i <= n; i++) {
            //Star i
            for (int j =1; j <= i; j++) {
                System.out.print("*");
            }
            //Space 2*(n-i)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //Star i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i = n; i >= 1; i--) {
            //start i
            for(int j=1; j<=i;j++) {
                System.out.print("*");
            }
            //Space 2*(n-i)
            for(int j=1; j<= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //Star i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        butterfly(8);
    }
}