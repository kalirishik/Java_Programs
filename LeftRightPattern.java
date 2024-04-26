import java.util.Scanner;

 import java.util.*;
public class LeftRightPattern{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s;
        for(int i=0;i<n;i++){
            for( s=n-1-i;s>0;s--){
                System.out.print("  ");
            }
            for(int j=0;j<(2*i)+2;j++){
                if(i==j)
                    System.out.print("*  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}

