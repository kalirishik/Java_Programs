import java.util.*;
public class LastLetterVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        char c=s.charAt(s.length()-1);
        String vowel=(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')?"Vowel":"Not";
        System.out.println(vowel);
    }
}
