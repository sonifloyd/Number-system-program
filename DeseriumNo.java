import java.util.Scanner;
public class DeseriumNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        DeseriumNo d=new DeseriumNo();
        boolean an =d.isDeseriumNo(num);
        if(an==true)
        System.out.println(num+ "is DeseriumNo");
        else
        System.out.println(num+"is not DseriumNo");
    }
    int n,d,len, sum=0;
  boolean  isDeseriumNo(int n){
        while(n!=0){
            d=n%10;
            sum=sum+(int)Math.pow(d,len);
            len--;
            n=n/10;

        }
        if (sum==n)
        return true;
        else
        return false;
    }
}