import java.util.*;
public class ArrayReverseIndividual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
            int n=a[i];
            int sum=0;
            while(n>0){
                int re=n%10;
                sum=(sum*10)+re;
                n/=10;
            }
            System.out.println(sum);
        }

    }
}
