import java.util.Scanner;

public class Binarytodecimal {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        long num = in.nextInt();
        int ans = BtoD(num);
        System.out.print("Decimal of num "+num+" is :"+ans);
    }
    static int BtoD(long n){
        int decimal = 0;
        int i = 0;
        while (n!=0){
            decimal += (n%10) * Math.pow(2, i);
            n /= 10;
            i++;
        }
        return decimal;
    }
}
