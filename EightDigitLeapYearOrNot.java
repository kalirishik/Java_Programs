import java.util.*;
public class EightDigitLeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=n/10000;
        if(l%2==0){
            if(l%400==0 && l%100!=0)
                System.out.println("leapYear");
        }
        else
            System.out.println("Not a Leap Year");
    }
}
