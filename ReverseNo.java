/* WAJP to reverse a number */



import java.util.Scanner;
public class ReverseNo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter any number");
        int input  = sc.nextInt();
        int a = isReverse(input);
        System.out.println(a+" is reverse No.");
    }
      static   int isReverse(int n){
            int rev=0;
            while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
            }
            return rev;
            
        
    }
}


