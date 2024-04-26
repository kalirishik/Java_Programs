import java.util.*;
public class ArraySortDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c[]=s.toCharArray();
        Arrays.sort(c);
        String r=new String(c);
        System.out.println(r);

    }
}
