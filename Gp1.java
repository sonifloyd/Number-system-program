

/*  You a given a number N. You need to print the pattern for the given value of N.
for N=2 the pattern will be 
2 2 1 1
2 1
for N=3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1 */
import java.util.Scanner;
public class Gp1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();

        
for(int N=n;N>0;N--){
        for(int i=n;i>0;i--){
            for(int j=1;j<=N;j++){
                System.out.print(i+"");
            }
        }
        System.out.println();
    }
}
}