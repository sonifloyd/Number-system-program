
/* WAJP TO print 1 to N number*/
import java.util.Scanner;
public class Print1ToN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
          isPrint(n);
    }
    static int isPrint(int n){
       for( int i=1;i<=n;i++){
       
            System.out.println(i);
            
        }
    
    return 0;
}
}
