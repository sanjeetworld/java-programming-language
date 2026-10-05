public class Pattern {
    public static void inverted_rotated_halfpyramid(int n) {
        // outer lopp
        for (int i = 1; i <= n; i++) {
            //inner loop for space
            for (int j  = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String args[]) {
        inverted_rotated_halfpyramid(10);
    }
}
