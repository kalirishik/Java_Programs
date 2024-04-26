import java.util.Scanner;
public class MatrixSevenXSeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[][]=new int[a][a];
        for(int i=0;i<a;i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int right=0;
        int left=0;
        int top=0;
        int bottom=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print(arr[i][j]+" ");
                if(i+j==a-1 || i==j)
                    continue;
                else if(i+j<a-1 && i>j){
                    left=left+arr[i][j];
                }
                else if(i+j>a-1 && i<j){
                    right=right+arr[i][j];
                }
                else if(i>j){
                    bottom=bottom+arr[i][j];
                }
                else
                    top=top+arr[i][j];
            }
            System.out.println();
        }
        System.out.println("r-"+right);
        System.out.println("l-"+left);
        System.out.println("t-"+top);
        System.out.println("b-"+bottom);
    }
}