
/*  1,1,2,2,4,4,8,8,16,16 also this code */
import java.util.Scanner;
public class P3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        if(n%2==0){
        int a= 1;
        int r=2;
        int t =(int)(a*(Math.pow(r,n-1)));
        
        System.out.println(t);
        }
        else{
        int a= 1;
        int r=2;
         int  t =(int)(a*(Math.pow(r,n-1)));
        System.out.println(t);
        }
        
        
       



 }

}