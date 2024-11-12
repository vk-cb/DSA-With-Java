import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
        
        long first = 0, second = 1;
        System.out.print("Fibonacci sequence up to " + num + ": ");
        
        if (num >= 0) {
            System.out.print(first + " " +second+ " ");
            
            for (int i = 2; i < num; i++) {
                long next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
        else{
            System.out.println("Invalid input. Please enter a positive integer.");
        }

    }
}
