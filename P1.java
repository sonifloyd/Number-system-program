

/*  Find the 15th term of the series?

0,0,7,6,14,12,21,18, 28 */
public class P1{
    public static void main(String[] args) {
        int n= 15;
        
        if(n%2==0)
        System.out.println((n/2-1)*6);
        else 
        System.out.println(n/2*6);
    }
}
       