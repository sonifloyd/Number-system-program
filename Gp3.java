

/* Given the first 2 terms A and B of an
Arithmetic Series, tell the Nth term of the series.   */
import java.util.Scanner;
public class Gp3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int t1=3;
        int t2=5;
        int d= t2-t1;
        for(int i=1;i<=n;i++){
        int ti = (t1 + (i+1-1)*d);
         System.out.print(ti+" ");
        }
    }
}