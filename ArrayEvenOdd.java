import java.util.*;
public class ArrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0)
                System.out.println(a[i]+"-Even");
            else
                System.out.println(a[i]+"-odd");
        }
    }
}
