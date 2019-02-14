

/* Find the nth term of the series.

1,1,2,3,4,9,8,27,16,81,32,243,…. */
import java.util.Scanner;
public class P2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        if(n%2==0){
        int a= 1;
        int r=3;
        int  t =(int)(a*(Math.pow(r,n-1)));
        
        System.out.println(t);
        }
        else{
        int a= 1;
        int r=3;
         int  t = (int )(a*(Math.pow(r,n-1)));
        System.out.println(t);
        }
        
        
       



 }

}