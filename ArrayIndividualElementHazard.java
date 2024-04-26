import java.util.*;
public class ArrayIndividualElementHazard {
    static void Print(int a[],int l){
        int sum=0;
        for(int i=0;i<l;i++){
            int n=a[i];
            while(n>0){
                int re=n%10;
                sum+=re;
                n/=10;
            }
            if(a[i]%sum==0)
                System.out.println(a[i]+" hazard");
            else
                System.out.println(a[i]+" not hazard");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        Print(a,s);
    }
}
