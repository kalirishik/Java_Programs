import java.util.*;
public class LastEven350To450 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=350;i<=450;i++){
            if(i%2==0)
                System.out.println(i%10);
        }
        int j=350,k=350;
        while(j<=450){
            if(j%2==0)
                System.out.println(j%10);
            j++;
        }
        do{
            if(k%2==0)
                System.out.println(k%10);
            k++;
        }while(k<=450);
    }
}
