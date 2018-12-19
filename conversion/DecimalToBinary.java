import java.util.Scanner;
class DecimalToBinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary[] =new int[100];
        int i=0,num;
        System.out.println("Enter any Decimal  number");
         num =sc.nextInt();
        while(num !=0){
            binary[i] = num%2;
            num=num/2;
            i++;



        }
        System.out.println("Binary no. is");
        for(int j= i-1;j>=0;j--)
        System.out.println(binary[j]);
    
    }
}