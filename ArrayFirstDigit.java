import java.util.*;
public class ArrayFirstDigit {
    static void Print(int a[],int l){
        for(int i=0;i<l;i++){
            int f=(int)Math.log10(a[i]);
            int m=(int)Math.pow(10,f);
            System.out.println(a[i]/m);
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
