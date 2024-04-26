import java.util.*;
public class Electricity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=(int)(100*0.5);
        int b=(int)(200*1.5);
        int c=(int)(200*2.5);
        double rupee=(n<=100)?(n*0.5):((n>100 && n<=300)?(a+(n-100)*1.5):((n>300 && n<=500)?(a+b+(n-300)*2.5):(a+b+c+(n-500)*5)));
        System.out.println(rupee);


    }
}
