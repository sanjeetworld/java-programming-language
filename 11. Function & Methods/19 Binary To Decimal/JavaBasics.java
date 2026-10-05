public class JavaBasics {
    public static void binTOdec(int BinNum) {
        int myNum = BinNum;
        int pow = 0;
        int decNum = 0;
        while (BinNum > 0) {
            int lastdig = BinNum % 10;
            decNum = decNum + (lastdig *(int)Math.pow(2, pow));
            pow ++;
            BinNum = BinNum / 10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }
    public static void main(String args[]) {
        binTOdec(101);

    }
}
