import java.util.*;
public class GenericSumOfDigit {
    static int Single(int n) {
        int sum = 0, r;
        while (n != 0) {
            r = n % 10;
            sum += r;
            n /= 10;
        }
        return  sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=Single(n);
        int sum=0;
        if(r>1) {
            sum = Single(r);
        }
        System.out.println(sum);
    }
}
