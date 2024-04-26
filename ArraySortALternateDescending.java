import java.util.*;
public class ArraySortALternateDescending {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int s=sc.nextInt();
                int a[]=new int[s];
                int max[]=new int[s%2==1?(s/2)+1:s/2];
                int k=0;
                for(int i=0;i<s;i++){
                    a[i]=sc.nextInt();
                    if(i%2==0)
                        max[k++]=a[i];
                }
                Arrays.sort(max);
                int l=max.length-1;
                for(int i=0;i<s;i++){
                    if(i%2==0)
                        System.out.print(max[l--]+" ");
                    else
                        System.out.print(a[i]+" ");
                }

            }
        }

