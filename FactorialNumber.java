import java.util.*;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        for(long i=n-1;i>=1;i--){
            n=n*i;
        }
        System.out.println(n);

    }
}
