import java.util.Scanner;
public class ArmstrongNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        ArmstrongNo a=new ArmstrongNo();
        boolean an =a.isArmstrongNo(num);
        if(an==true)
        System.out.println(num+ "is ArmstrongNo");
        else
        System.out.println(num+"is not ArmstrongNo");
    }
    int n,temp, total=0;
  boolean  isArmstrongNo(int n){
        while(n!=0){
            temp=n%10;
            total=total+temp*temp*temp;
            n=n/10;

        }
        if (total==n)
        return true;
        else
        return false;
    }
}