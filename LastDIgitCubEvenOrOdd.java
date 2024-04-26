
import java.util.*;
public class LastDIgitCubEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=n%10;
        int c=(int)Math.pow(l,3);
        System.out.println(((c&1)==1)?"Odd":"Even");
    }
}
