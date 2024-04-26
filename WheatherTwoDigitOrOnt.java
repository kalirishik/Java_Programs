import java.util.*;
public class WheatherTwoDigitOrOnt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=(int)Math.log10(n)+1;
        String c=(l==2)?"Two digit":"Not two digit";
        System.out.println(c);

    }
}
