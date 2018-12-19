
/* WAJP TO DISPLAY SUM OF 1 TO N NUMBER*/
import java.util.Scanner;
public class DisplaySumOf1ToN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n ");
        int input=sc.nextInt();
        DisplaySum(input);
    }
    static int DisplaySum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            

        }
        System.out.println(sum);
        return 0;
    }
    

    
 
}