import java.util.*;
public class ArrayArmstrong{
    static void Print(int a[],int l) {
        int sum = 0;
        for (int i = 0; i < l; i++) {
            int n = a[i];
            int size=(int)Math.log10(a[i])+1;
            while (n > 0) {
                int re = n % 10;
                sum+=Math.pow(re,size);
                n /= 10;
            }
            if (sum==a[i])
                System.out.println(a[i] + " Armstrong");
            else
                System.out.println(a[i] + " not armstrong");
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
