import java.util.*;
public class D2BOH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(10);
        String b=Integer.toBinaryString(n);
        String o=Integer.toOctalString(n);
        String h=Integer.toHexString(n);
        System.out.println(b);
        System.out.println(o);
        System.out.println(h);
        System.out.println(n);

    }
}
