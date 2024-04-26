import java.util.*;
public class ArrayGenericroot {
    static int generic(int n){
        int sum=0;
        while(n>0){
            int re=n%10;
            sum+=re;
            n/=10;
        }
        if(sum>=0 && sum<=9)
            return sum;
        else
            return generic(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
            System.out.println(generic(a[i]));
        }
    }
}
