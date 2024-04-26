import java.util.*;
public class ArrayIncrementbyOnedonotNine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            int n=a[i];
            int sum=0,sum1=0;
            while(n>0){
                int r=n%10;
                if(r==9){
                    sum=(sum*10)+r;
                }
                else{
                sum=(sum*10)+(r+1);
                }
                n/=10;

            }
            while(sum>0){
                int re=sum%10;
                sum1=(sum1*10)+re;
                sum/=10;
            }
            System.out.println(a[i]+"-"+sum1);
        }
    }
}
