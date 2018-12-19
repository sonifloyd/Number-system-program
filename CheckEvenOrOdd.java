
/* WAJP TO CHECK GIVEN NUMBER IS EVEN OR ODD*/
import java.util.Scanner;
public class CheckEvenOrOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int input=sc.nextInt();
         isCheck(input);
    }
    static int isCheck(int n){
        
            if(n%2==0){
                System.out.println(" even number");
            }
            else
            {
            System.out.println("odd number");
            }
         
        return 0;
    }
}