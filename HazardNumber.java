import java.util.*;
public class
HazardNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,r=n;
        while(r>0){
            int re=r%10;
            sum+=re;
            r/=10;
        }
        System.out.println((n%sum==0)?"Hazard Number":"Not Hazard Number");
    }
}
