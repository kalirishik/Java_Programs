import java.util.*;
public class FirstANdLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int re=(int)Math.log10(n);
        int f=(int)Math.pow(10,re);
        int sum=(n/f)+(n%10);
        System.out.println(sum);
    }
}
