import java.util.*;
public class MiddleDigit100To150 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=100;i<=150;i++){
            int l=(int)Math.log10(i);
            int m=(int)(i/Math.pow(10,(l/2)))%10;
            System.out.println(m);
        }
        int j=100,k=100;
        while(j<=150){
            int l=(int)Math.log10(j);
            int m=(int)(j/Math.pow(10,(l/2)))%10;
            System.out.println(m);
            j++;
        }
        do{
            int l=(int)Math.log10(k);
            int m=(int)(k/Math.pow(10,(l/2)))%10;
            System.out.println(m);
            k++;
        }while(k<=150);
    }
}
