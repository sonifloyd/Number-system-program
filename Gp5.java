

/* Given an array A of size N, print the reverse of it. */
import java.util.Scanner;
public class Gp5{
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the value of n");
         int n= sc.nextInt();
         int A[] =new int[n];
         int rev=0;
         for(int i=0;i<n;i++){
             A[i]=sc.nextInt();
            }
            System.out.println();
            int len=A.length;
            System.out.println("Size of an array is "+len);
            for(int i=0;i<=len;i--){
                int r=n%10;
                rev =rev*10 +r;
                int n=n/10;
            }
            System.out.print(rev+" ");
 }
}