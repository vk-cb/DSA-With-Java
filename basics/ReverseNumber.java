import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int reverseNumber=0;
        while(num>0){
            int remainder = num%10;
            reverseNumber= reverseNumber*10 + remainder;
            num = num/10;
        }
        System.out.println("Reverse of the number is: " + reverseNumber);
    }
}