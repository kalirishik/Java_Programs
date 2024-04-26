import java.util.*;
public class Anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(s1.length()==s2.length()){
            boolean res=Arrays.equals(c1,c2);
            if(res)
                System.out.println("It is An Anagram");
            else
                System.out.println("It is not An Anagram");
        }
        else{
            System.out.println("It is not An Anagram");
        }
    }
}
