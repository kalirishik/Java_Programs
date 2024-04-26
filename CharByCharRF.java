import java.util.*;
public class CharByCharRF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
            System.out.println(s.charAt(s.length()-i-1));
        }
    }
}
