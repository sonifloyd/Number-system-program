

import java.util.Scanner;
public class PerfectNo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter any number");
        int input  = sc.nextInt();
        
         boolean a  = isPerfectNo(input);
         if(a)
         System.out.println("No. is Perfect number");
         else
         System.out.println(a+ " No. is not perfect");
        
    }
    static  boolean isPerfectNo(int n){
        int sum=0,i=1;
        while(i<=n/2){
            if((n%i==0))
            sum=sum+i;
            i++;
        }
        if(sum==n)
        return true;
        else
        return false;
    }
        
    
}