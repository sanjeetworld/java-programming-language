// public class JavaBasics {
//     public static void main(String args[]) {
//         // System.out.println(s);                  // check what happen
//         int s = 44;
//         System.out.println(s);
//     }
// }


// method scope of a veriable
public class JavaBasics {
    public static void prints() {
        int s = 56;
    }
    public static void main(String args[]) {
        System.out.println(s);                 // we can not use directly we can use as parameter
    }
}