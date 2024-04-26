import java.util.*;
public class LeftPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int s=n-1-i;s>0;s--){
                System.out.print("  ");
            }
            for(int j=0;j<(1*i)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
