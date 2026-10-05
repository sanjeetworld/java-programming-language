// public class JavaBasics {


// if (n == 2) {
//     System.out.println(true);
// }


//     public static boolean isprime(int n) {
//         boolean isprime = true;
//         for (int i = 2; i <= n-1; i++) {
//             if (n % i == 0) {
//                 isprime = false;
//                 break;
//             }
//         }
//         return isprime;
//     }
//     public static void main(String args[]) {
//             System.out.println(isprime(5));
//     }
// }



// same as upper

// public class JavaBasics {
//     public static boolean isprime(int n) {
//         boolean isprime = true;
//         for (int i =2; i <= n-1; i++) {
//             if (n % i == 0) {
//                 isprime = false;
//             }
//         }
//         return isprime;
//     }
//     public static void main (String args[]) {
//         System.out.println(isprime(9));
//     }
// }


// some method change


public class JavaBasics {
    public static boolean isprime(int n) {
        boolean isprime = true;
        if (n == 2) {
            System.out.println(true);
        }
        for (int i = 2; i <= n-1; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println(isprime(7));
    }
}