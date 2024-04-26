import java.util.*;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=(int)Math.log10(n);
        System.out.println(c+1);

    }
}
