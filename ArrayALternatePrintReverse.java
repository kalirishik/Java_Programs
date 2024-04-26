import java.util.*;
public class ArrayALternatePrintReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=a.length-1;j>=0;j-=2){
            System.out.print(a[j]+" ");
        }
    }
}
