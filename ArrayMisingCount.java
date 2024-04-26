import java.util.*;
public class ArrayMisingCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int c=((a[s-1]-a[0])+1)-s;
        System.out.println(c);
    }
}
