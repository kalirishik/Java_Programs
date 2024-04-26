import java.util.*;
public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        int i=((l&1)==1)?(l/2):(l-1);
        System.out.println(s.charAt(i));


    }
}
