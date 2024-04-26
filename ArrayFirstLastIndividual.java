import java.util.*;
public class ArrayFirstLastIndividual {
    static void sum(int n,int d){
        int r=(n/d)+(n%10);
        System.out.println(r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
            int l=(int)Math.log10(a[i]);
            int m=(int)Math.pow(10,l);
            sum(a[i],m);

        }
    }
}
