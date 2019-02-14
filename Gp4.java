
/* Given the first 2 terms A and B of an Arithmetic Series, 
tell the Nth term of the series.    */
import java.util.Scanner;
public class Gp4{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n =sc.nextInt();
        int t1=2;
        int t2=4;
        int r= t2/t1;
        for(int i=1;i<=n;i++){
             int ti =(int)(t1*Math.pow(r,i-1));
             System.out.print(ti +" ");
        }
    }
}