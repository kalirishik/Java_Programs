import java.util.*;
public class ArrayPrimeFactor {
    static void Prime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                c++;
        }
        if(c==2)
            System.out.print(n+" Prime ");
        else
            System.out.print(n+" not Prime ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s+1];
        for(int i=1;i<=s;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<=s;i++){
            int f=a[i];
            for(int j=1;j<=f;j++){
                if(a[i]%j==0)
                    Prime(j);
            }
            System.out.println();
        }
    }
}
