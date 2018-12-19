/* WAJP TO PRINT REVERSE  OF N TO 1 NUMBER*/
import java.util.Scanner;
public class ReverseNTo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int input =sc.nextInt();
        Reverse(input);

    }
     static int Reverse(int n){
        for( int i=n;i>0;i--){
            System.out.println(i);
        }
        return 0;
    }
}