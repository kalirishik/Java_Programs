import java.util.*;
public class AsciiCharMinusOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c;
        int n;
        do{
             c=sc.next().charAt(0);
             n=(int)c;
            System.out.println(n);
        }while(c!='1');
    }
}
