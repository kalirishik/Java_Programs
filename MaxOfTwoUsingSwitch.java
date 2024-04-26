import java.util.*;
public class MaxOfTwoUsingSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch((a>b)?0:1){
            case 0:
                System.out.println(a);
                break;
            case 1:
                System.out.println(b);
        }
    }
}
