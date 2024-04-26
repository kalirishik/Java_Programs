import java.util.*;
public class FirstLast200To500 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=200;i<=500;i++){
            int l=(int)Math.log10(i);
            System.out.println((i/l)+(i%10));
        }
        int j=200,k=200;
        while(j<=500){
            int l=(int)Math.log10(j);
            System.out.println((j/l)+(j%10));
            j++;
        }
        do{
            int l=(int)Math.log10(k);
            System.out.println((j/l)+(k%10));
            k++;
        }while(k<=500);
    }
}
