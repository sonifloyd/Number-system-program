/* write a java programme  to count abd display how many even and odd digits present in your number */
import java.util.Scanner;
public class EvenOrOddDigitsCount {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number");
    int n =sc.nextInt();
    int ec=0, oc=0;
    do{
        int r =n%10;
        if (r%2==0)
        ec++;
        
        else 
        oc++;
        n=n/10;
    
        } 
         while(n!=0);
    
    
    System.out.println("Even No Digits are " +ec);
    System.out.println(" odd no digits are" +oc);

    
    

   }
}