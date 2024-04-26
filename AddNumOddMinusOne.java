import java.util.*;
public class AddNumOddMinusOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        loop:
       while(true){
           int n=sc.nextInt();
           if(n==-1)
               break loop;
           else
               if(n%2!=0)
                   sum+=n;
       }
        System.out.println(sum);
    }
}
