// public class JavaBasics {
//     public static void main(String[] args) {
//         int n = 8;
//         for (int line = 1; line <= n; line++) {
//             for (int star = 1; star <= n-line+1 + 1; star++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

public class JavaBasics {
    public static void main (String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}