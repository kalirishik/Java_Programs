import java.util.*;
public class ArraySortSpecificElement {
    static void Print(int arr[],int s){
        Arrays.sort(arr,s,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int si=sc.nextInt();
        Print(a,si);
    }
}
