import java.util.*;
public class ArrayAbsDiff {
    public static  void print(int a[],int l){
        for(int i=0;i<l-1;i++){
                int r = a[i] - a[i + 1];
                int abs = Math.abs(r);
                System.out.println(abs);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        print(a,s);
    }
}
