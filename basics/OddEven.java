import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        
        // Validate input to handle extreme test cases
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        scanner.close();
    }
}

