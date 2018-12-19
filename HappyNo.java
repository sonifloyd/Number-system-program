
import java.util.Scanner;
public class HappyNo{
    public static void main(String[] args) {
        HappyNo h=new HappyNo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No.");
        int n=sc.nextInt();
        boolean rs=h.isHappyNo(n);
        if(rs)
        System.out.println(n+"is Happy No");
        else
        System.out.println(n+"is not Happy No.");
    }
    boolean isHappyNo(int x){
        while(x>0){
            int sum=0;
            
                int r=x%10;
                sum=sum+r*r;
                x=x/10;
            }
            x=sum;
        
        return x==1||x==7;
    }
}