import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the last number: ");
        int last = scanner.nextInt();
        System.out.println("Prime numbers between " + first + " and " + last + ":");
    }
}
