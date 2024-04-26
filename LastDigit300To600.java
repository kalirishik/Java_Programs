import java.util.*;
public class LastDigit300To600 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=300;i<=600;i++){
            System.out.println(i%10);
        }
        int j=300,k=300;
        while(j<=600){
            System.out.println(j%10);
            j++;
        }
        do{
            System.out.println(k%10);
            k++;
        }while(k<=600);
    }
}
