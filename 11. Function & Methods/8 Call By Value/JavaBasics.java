public class JavaBasics {
    public static int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
        return 0;
    }
    public static void main(String[] arg) {
        int a = 5;
        int b = 10;
        int SwapNumber = swap(a, b);

    }
}
