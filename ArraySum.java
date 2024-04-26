import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int sum=0;
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
