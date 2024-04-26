import java.util.*;
public class ArrayEvenOddSeparate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        int e[]=new int[s];
        int o[]=new int[s];
        int k1=0,k2=0;
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                e[k1]=a[i];
                k1++;
            }
            else{
                o[k2]=a[i];
                k2++;
            }
        }
        System.out.println("Even number");
        for(int i=0;i<e.length;i++){
            if(e[i]!=0)
            System.out.print(e[i]+" ");
        }
        System.out.println("\nOdd number");
        for(int i=0;i<o.length;i++){
            if(o[i]!=0)
            System.out.print(o[i]+" ");
        }

    }
}
