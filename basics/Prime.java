import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if(num<2){
            System.out.println(num+" is not a prime number");
        }
        else if(num == 2){
            System.out.println(num+" is a prime number");
        }
        else {
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num+" is a prime number");
            }
            else{
                System.out.println(num+" is not a prime number");
            }
        }
        }
}
