import java.util.*;
public class ConsecutiveNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,c=1;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(i=0;i<n-1;i++){
            if(a[i]+1==a[i+1])
                c++;

        }
        System.out.println((c==n)?"It is Consecutive":"It is not Consecutive");
    }
}
