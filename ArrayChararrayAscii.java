import java.util.*;
public class ArrayChararrayAscii {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char c[]=s.toCharArray();
    for(int i=0;i<c.length;i++){
        System.out.print((int)s.charAt(i)+" ");
    }

    }
}
