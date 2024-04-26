import java.util.*;
public class ArraySumOfInvidualDigit {
    static int ReturnValue(int num){
        int sum=0;
            while(num>0){
                int re=num%10;
                sum+=re;
                num/=10;
            }
        return sum;
    }
    static void Sum(int arr[],int l){
        for(int i=0;i<l;i++){
            int n=arr[i];
            int sum=ReturnValue(n);
            System.out.print(sum+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        Sum(a,s);
    }
}
