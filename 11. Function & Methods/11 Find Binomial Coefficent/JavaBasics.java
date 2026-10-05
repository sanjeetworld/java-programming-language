public class JavaBasics {
    public static int factorial(int n) {
        int fact = 1;
        for (int i =1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int BinCoff(int n, int r) {
        int fact_A = factorial(n);
        int fact_B = factorial(r);
        int fact_nmr = factorial(n - r);
        int coff = (fact_A/(fact_B*fact_nmr));
        return coff;
    }
    public static void main(String[] arg) {
        int bin_coff = BinCoff(5,2);
        System.out.println(bin_coff);
    }
}
