import java.util.*;
public class FirstLastSUm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=n%100;
        int f=n/100;
        System.out.println(l+f);
    }
}
