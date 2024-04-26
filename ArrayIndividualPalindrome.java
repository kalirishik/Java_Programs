import java.util.*;
public class ArrayIndividualPalindrome {
    static void Pal(int n){
        int sum=0,r=n;
        while(n>0){
            int re=n%10;
            sum=(sum*10)+re;
            n/=10;
        }
        if(sum==r)
            System.out.println(sum+"-Palindrome");
        else
            System.out.println(sum+"-Not a Palindrome");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
            Pal(a[i]);
        }
    }
}
