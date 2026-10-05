public class JavaBAsics {
    public static boolean isprime(int n) {
        // boolean isprime = 0;              // not include this
        if (n == 2) {
            System.out.println(true);
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isprime(4));
    }
}
