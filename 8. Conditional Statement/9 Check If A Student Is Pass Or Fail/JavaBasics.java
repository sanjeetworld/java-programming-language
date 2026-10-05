import java.util.*;
public class JavaBasics {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String Report_card = (marks >= 30) ? "Pass" : "Fail";
        System.out.println(Report_card);
    }
}
