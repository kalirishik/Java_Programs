
import java.util.*;
public class FirstLastMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int la=n%10;
        int l=(int)Math.log10(n);
        int f=(int)(n/Math.pow(10,l));
        System.out.println((la>f)?la:f);
    }
}
