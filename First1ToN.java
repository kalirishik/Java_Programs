import java.util.*;
public class First1ToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
           int l=(int)Math.log10(i);
            int f=(int)(i/Math.pow(10,l));
            System.out.println(f);
        }
        int j=1;
        while(j<=n){
            int l=(int)Math.log10(j);
            int f=(int)(j/Math.pow(10,l));
            System.out.println(f);
            j++;
        }
        int k=1;
        do{
            int l=(int)Math.log10(k);
            int f=(int)(k/Math.pow(10,l));
            System.out.println(f);
            k++;
        }while(k<=n);
    }
}
