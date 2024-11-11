import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if(isPalindrome(num)){
            System.out.println(num + " is a palindrome.");
        }
        else{
            System.out.println(num + " is not a palindrome.");
        }

    }
    
    public static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int temp = num;
    
        while(num!=0){
            int rem = num%10;
            reversedNum = reversedNum*10 + rem;
            num = num/10;
        }
        if(temp==reversedNum){
            return true;
        }
        else{
            return false;
        }
    }
}
