import java.util.*;
public class ArrayFirstHalfSecondHalfSwapDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        int n=a[i];
        String s=String.valueOf(n);
        if(s.length()%2==0){
            int mid=s.length()/2;
            String f=s.substring(0,mid);
            String se=s.substring(mid);
            System.out.println(se+f+" ");
        }
        else{
            int mid=s.length()/2;
            String f=s.substring(0,mid);
            String m=s.substring(mid,mid+1);
            String se=s.substring(mid+1);
            System.out.println(se+m+f+" ");
        }

        }

    }
}
