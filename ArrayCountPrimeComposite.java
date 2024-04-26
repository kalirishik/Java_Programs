import java.util.*;
public class ArrayCountPrimeComposite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<s;i++){
            int c=0;
            int n=a[i];
            for(int j=1;j<=n;j++){
                if(n%j==0)
                    c++;
            }
            if(c==2)
                count++;
        }
        System.out.println("Prime Count="+count);
        System.out.println("Composite Count="+(s-count));
    }
}
