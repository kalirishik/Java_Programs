import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=(int)Math.log10(n)+1;
        int r=n,sum=0;
        while(r>0){
            int re=r%10;
            sum+=(int)Math.pow(re,d);
            r/=10;
        }
        System.out.println((sum==n)?"Armstrong Number":" not a Armstrong Number");
    }
}
