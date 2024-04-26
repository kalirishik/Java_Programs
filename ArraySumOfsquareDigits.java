import java.util.*;
public class ArraySumOfsquareDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
            int sum=0;
            int n=a[i];
            while(n>0){
                int re=n%10;
                sum+=re*re;
                n/=10;
            }
            System.out.println(a[i]+"-"+sum);
            sum=0;
        }

    }
}
