import java.util.*;
public class LeadersArray {
    static void PrintLeaderArray(int arr[],int l){
        int j;
        for(int i=0;i<l-1;i++){
            for( j=i+1;j<l;j++){
                if(arr[i]<=arr[j])
                    break;
            }
            if(j==l)
                System.out.println(arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[50];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        PrintLeaderArray(a,a.length);
    }
}
