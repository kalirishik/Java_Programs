import java.util.*;
public class LastDigitISEVenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=n%10;
        String c=((l&1)==1)?"Odd":"Even";
        System.out.println(c);
    }
}
