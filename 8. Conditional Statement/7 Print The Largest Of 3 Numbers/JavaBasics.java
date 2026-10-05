public class JavaBasics {
    public static void main(String[] args) {
        int A = 1;
        int B = 3;
        int C = 6;
        if (A >= B && A >= C) {
            System.out.println("A is large than all");
        }
        else if (B >= C) {
            System.out.println("B is larger than all");
        }
        else {
            System.out.println("C is larger than all");
        }
    }
}