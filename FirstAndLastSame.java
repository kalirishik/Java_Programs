import java.util.*;
public class FirstAndLastSame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int la=n%10;
        int l=(int)Math.log10(n);
        int f=(int)(n/Math.pow(10,l));
        if(f==la)
            System.out.println("Same");
        else
            System.out.println("not same");
    }
}
