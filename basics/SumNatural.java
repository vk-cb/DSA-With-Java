import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the nth number : "+ " ");
        int number = scanner.nextInt();
        for(int i= 1; i<=number; i++){
            sum += i;
        }
        System.out.println("The sum of  " + number + " natural numbers is: " + sum);
}
}
