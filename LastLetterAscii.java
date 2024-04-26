import java.util.*;
public class LastLetterAscii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=s.charAt(s.length()-1);
        System.out.println((int)c);
    }
}
