import java.util.*;
public class ArrayTwoarraySame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        int b[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            b[i]=sc.nextInt();
        }
        if(Arrays.equals(a,b))
            System.out.println("equal");
        else
            System.out.println("Not equal");

    }
}
