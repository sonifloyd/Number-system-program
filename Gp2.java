

/*  Print the table of a given number N upto 10.
Example:
Input:
1
9 

Output:
9 18 27 36 45 54 63 72 81 90 */
import java.util.Scanner;
public class Gp2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("No.of input is b/w 1 to 100");
        int n = sc.nextInt();
        //  int t=1;
        for(int i=1;i<=10;i++){
          int   t=n*i;

            System.out.print(t+" ");
        }

    }
}