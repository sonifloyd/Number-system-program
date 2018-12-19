import java.util.Scanner;
class ExponentialNotation{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any Number");
        double num = sc.nextDouble();
        String res = Math.exp(num);
        System.out.println(res);

    }
}