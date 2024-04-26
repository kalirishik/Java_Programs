import java.util.*;
public class ArrayFirstSecondHalfSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int f=s/2;
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int sum1=0,sum2=0;
        for(int i=0;i<f;i++){
            sum1+=a[i];
        }
        for(int i=f;i<s;i++){
            sum2+=a[i];
        }
        if(sum1==sum2)
            System.out.println("Equal");
        else
            System.out.println("not equal");
    }
}
