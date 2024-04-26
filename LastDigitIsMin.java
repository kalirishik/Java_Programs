import java.util.*;
public class LastDigitIsMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int r1=n1%10;
        int r2=n2%10;
        int r3=n3%10;
        int min=(r1<r2 && r1<r3)?r1:(r2<r3)?r2:r3;
        System.out.println(min);


    }
}
