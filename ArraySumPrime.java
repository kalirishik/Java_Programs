import java.util.*;
public class ArraySumPrime {
    static void prime(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            int c=0;
            int n=a[i];
            for(int j=1;j<=n;j++){
                if(n%j==0)
                    c++;
            }
            if(c==2)
                sum+=n;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        prime(a);
    }
}
