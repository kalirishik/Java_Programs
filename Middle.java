import java.util.*;
public class Middle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=(int)Math.log10(n)+1;
        int mid=(int)(n/Math.pow(10,l/2))%10;
        System.out.println(mid);
    }
}
