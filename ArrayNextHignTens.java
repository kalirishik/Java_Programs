import java.util.*;
public class ArrayNextHignTens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
            int r=((a[i]/10)*10)+10;
            System.out.print(r+" ");
        }
    }
}
