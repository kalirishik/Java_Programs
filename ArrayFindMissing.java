import java.sql.SQLOutput;
import java.util.*;
public class ArrayFindMissing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        int sum1=0,sum2=0;
        for(int i=0;i<s;i++){
         a[i]=sc.nextInt();
         sum1+=a[i];
        }
        for(int i=1;i<=a[a.length-1];i++){
           sum2+=i;
        }
        int r=sum2-sum1;
        System.out.println(r);
    }
}
