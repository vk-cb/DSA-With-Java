import java.util.Scanner;
 public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter  a number");

        if(scanner.hasNextInt()){
            int num = scanner.nextInt();

            if(num %2 == 0){
                System.out.println("number is even");
            }
            else {
                System.out.println("number is odd");
            }
        }
        else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        scanner.close();
    }
 }
