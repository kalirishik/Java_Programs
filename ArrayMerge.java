import java.util.*;
public class ArrayMerge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int k=s;
        int a[]=new int[s];
        int b[]=new int[s];
        int c[]=new int[s+s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
            c[i]=a[i];
        }
        for(int i=0;i<s;i++){
            b[i]=sc.nextInt();
            c[k]=b[i];
            k++;
        }
        for(int j=0;j<c.length;j++){
            System.out.print(c[j]+" ");
        }

    }
}
