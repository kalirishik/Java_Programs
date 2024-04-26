import java.util.*;
public class CountOfWOrd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        System.out.println(s1.length);
        int d=0,sp=0;
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<s1.length;j++){
            if(s1[i].charAt(j)>=48 && s1[i].charAt(j)<=57)
                d++;
            else if(s1[i].charAt(j)>=65 && s1[i].charAt(j)<=90)
                continue;
            else if(s1[i].charAt(j)>=97 && s1[i].charAt(j)<=122)
                continue;
            else
                sp++;
            }
        }
        System.out.println(d);
        System.out.println(sp);
    }
}
