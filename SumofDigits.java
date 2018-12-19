/*   write a java programme to define a method to calculate return sum of its digit */
import java.util.Scanner;
public class SumofDigits{
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);//user take input from system
        System.out.println("Enter number");
        int no =sc.nextInt();
        Digits dg =new Digits();


        int res=dg.sumDigits(no);

       System.out.println("sum of  digits of"+ no+ "is"+res );
    }
}

        class Digits{
            int sumDigits(int n)
            {
                int sum =0 ,r;
                do{
                    
                    r=n%10;
                    sum = sum +r;

                }
                while(n!=0);
                return sum;
            }
        }

    
