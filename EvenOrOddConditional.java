import java.util.*;
public class EvenOrOddConditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=((n&1)==1)?"Odd":"Even";
        System.out.println(s);
    }
}
