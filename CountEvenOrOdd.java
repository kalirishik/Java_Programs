import java.util.*;
public class CountEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=(int)Math.log10(n)+1;
        System.out.println(((c&1)==1)?"Odd":"Even");
    }
}
