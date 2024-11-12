import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        in.close();

        int ans = lcm(num1, num2);
        System.out.print("LCM of " +num1+" and "+ num2+ " is :"+ans);
    }
    //Method 1
    static int lcm(int a , int b){
        
    int max = (a > b) ? a : b;
    int ans=-1;
    for (int i = max; i <= a * b; i++)
      {
     if (i % a == 0 && i % b == 0)
        {
         ans = i;
         break;
        }
      }
      return ans;
    }

    // Method 2

    // static int lcm(int a , int b){
    //     return (a*b) / hcf(a,b);
    // }
    // public static int hcf(int a, int b){
    //     if(a==0){
    //         return b;
    //     }
    //     else if(b==0){
    //         return a;
    //     }
    //     else if(a==b){
    //         return a;
    //     }
    //     else if(a>b){
    //         return hcf(a%b, b);
    //     }
    //     return hcf(b%a, a);
    // }
}
