import java.util.*;
public class LargestOfDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,max=0;
        while(n!=0){
            r=n%10;
            if(max<r)
                max=r;
            n/=10;
        }
        System.out.println(max);

    }
}
