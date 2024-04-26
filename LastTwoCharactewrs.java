import java.util.*;
public class LastTwoCharactewrs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.charAt(s.length()-2));
    }
}
