import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int re=(int)Math.log10(n);
        int f=(int)Math.pow(10,re);
        System.out.println(n/f);
    }
}
