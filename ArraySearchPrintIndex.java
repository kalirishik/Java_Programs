import java.util.*;
public class ArraySearchPrintIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int se=sc.nextInt();
        for(int i=0;i<s;i++){
            if(a[i]==se){
                System.out.println(i);
            }
        }
    }
}
