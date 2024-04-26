import java.util.*;
public class AlternateReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        for(int i=0;i<s1.length;i++){
            if(i%2==0){
                for(int j=s1[i].length()-1;j>=0;j--){
                    System.out.print(s1[i].charAt(j));
                }
            }
            else{
                System.out.print("\t"+s1[i]+"\t");
            }
        }

    }
}
