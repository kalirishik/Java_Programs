import java.util.*;
public class ArraySwapAdjacent {
    static void Swap(int a[],int l){
            for(int i=0;i<l-1;i+=2){
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
            }
        System.out.println( Arrays.toString(a));

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        Swap(a,s);
    }
}
