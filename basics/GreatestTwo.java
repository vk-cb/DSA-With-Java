import java.util.Scanner;

public class GreatestTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int first = scanner.nextInt();
        System.out.print("Enter the second number:");
        int second = scanner.nextInt();
        if(first>second){
            System.out.print("The greatest number is: " + first);
        }
        else if(first == second){
            System.out.print("Both numbers are equal.");
        }
        else{
            System.out.print("The greatest number is: " + second);
        }
    }
}
