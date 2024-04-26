import java.util.*;
public class ArrayAbsDiffMaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int max=0,r1=0,r2=0;
        for(int i=0;i<s-1;i++){
            int f1=a[i];
            int f2=a[i+1];
            int d=f1-f2;
            int ab=Math.abs(d);
            if(max<ab){
                max=ab;
                 r1=f1;
                 r2=f2;
            }
        }
        System.out.println(r1+","+r2+":"+max);

    }
}
