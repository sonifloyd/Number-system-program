import java.util.Scanner;
public class StrongNo {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number");
    int n =sc.nextInt();
    StrongNo s= new StrongNo();
    boolean rs=s.isStrong(n);
    if(rs)
    System.out.println(n+" is strong no");
    else
    System.out.println(n+" is not strong");
    
    

    }



        boolean isStrong(int n){
            int sum =0,t=n;
            do{
                int r=n%10;
                sum =sum+fact(r);
                n=n/10;
            }while(n!=0);
            return t==sum;
        }
    
    int fact(int n)
    {
        int f=1;
        while(n>0)
        {
            f=f*n;
            n--;
        }
        return f;
  }
 }
