
/* WAJP to count and  display even and odd digit you entered */
import java.util.Scanner;
public class CountEven&OddNoDigit{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter any number");
        int input  = sc.nextInt();
        int a=countDigit(input);
        System.out.println(a+" digit");
    }
      static   int countDigit(int n){
            int count=0,oc=0,ec=0;
            while(n>0){
                int r=n%10;// it gives last digit
                if(r%2==0)
                ec++; 
                
                else
                oc++;
                n=n/10;//it remove last digit
            }
            return ;
            
        
    }
}
