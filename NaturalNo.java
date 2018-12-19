import java.util.Scanner;
public class NaturalNo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number");
        int no =sc.nextInt();
        Naturalno n =new Naturalno();
        int s =n.SumofNaturalNo(no);
        System.out.println("sum of"+ no + "is"+s);

    }
}


class Naturalno{
    int SumofNaturalNo(int n){
        int sum;
        sum =n*(n+1)/2;
        return sum;
    }
}

        

