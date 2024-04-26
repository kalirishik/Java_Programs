import java.util.*;
public class Even800To950 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=800;i<=950;i++){
            if(i%2==0)
                System.out.println(i);
        }
        int j=800,k=800;
        while(j<=950){
            if(j%2==0)
                System.out.println(j);
            j++;
        }
        do{
            if(k%2==0)
                System.out.println(k);
            k++;
        }while(k<=950);
    }
}
