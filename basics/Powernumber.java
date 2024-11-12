import java.util.Scanner;

public class Powernumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a base number: ");
        int base  = in.nextInt();
        System.out.print("Enter an exponent: ");
        int exponent = in.nextInt();
        long result = calculate(base, exponent);
        System.out.println("Power of "+base+" and its exponent is " + exponent + " : " + result);
    }
    static long calculate(int base, int exponent){
        int ans=1;
        for (int i = 0; i < exponent; i++) {
            ans= ans*base;
        }
        return ans;
    }
}
