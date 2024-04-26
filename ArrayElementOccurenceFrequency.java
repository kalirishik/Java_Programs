import java.util.*;
public class ArrayElementOccurenceFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            int c=0;
            int n=a[i];
            for(int j=0;j<i;j++){
             if(a[j]==n) {
                c++;
                break;
             }
             }
            if(c==0){
                for(int j=0;j<s;j++){
                    if(a[j]==n)
                        c++;
                }
            System.out.println(n+"-"+c);
            }
        }

    }
}
