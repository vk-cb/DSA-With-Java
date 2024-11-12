import java.util.Scanner;

public class HCF{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        in.close();
        
        int ans = hcf(num1, num2);
        System.out.print("HCF of " +num1+" and "+ num2+ " is :"+ans);
    }
    
    public static int hcf(int a, int b){
        if(a==0){
            return b;
        }
        else if(b==0){
            return a;
        }
        else if(a==b){
            return a;
        }
        else if(a>b){
            return hcf(a%b, b);
        }
        return hcf(b%a, a);
    }
}