 

 /*WAJP to count how many digit you enter */
 import java.util.Scanner;
public class CountDigit{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter any number");
        int input  = sc.nextInt();
        int a=countDigit(input);
        System.out.println(a+" digit");
    }
      static   int countDigit(int n){
            int count=0;
            while(n!=0){
                count++;
                n=n/10;
            }
            return count;
            
        
    }
}
