import java.util.*;
public class CharAPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
