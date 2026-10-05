public class JavaBasics {
    public static void dectoBin(int n) {
        int mynum = n;
        int pow = 0;
        int bin = 0;
        int rem = 0;
        while(n > 0) {
            rem = n%2;
            bin = bin + rem * (int)Math.pow(10, pow);
            pow++;
            n = n/2;
        }
        System.out.println("Binary form of " + mynum + " = " + bin);
    }
    public static void main(String args[]) {
    dectoBin(7);
    }
}
