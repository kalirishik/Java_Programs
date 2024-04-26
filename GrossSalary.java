import java.util.*;
public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double basicPay=sc.nextDouble();
        int HouserentAllowance=sc.nextInt();
        int deduction=sc.nextInt();
        int tax=sc.nextInt();
        System.out.println((basicPay+(HouserentAllowance/100)+(deduction/100))-(tax/100));

    }
}
