import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the last number: ");
        int last = scanner.nextInt();
        System.out.println("Prime numbers between " + first + " and " + last + ":");
        for(int i=first; i<=last; i++){
            if(i<2){
                continue;
               
            }
            else{
                if(isPrime(i)){
                    System.out.print(i + " ");
                }
            }
            
        }
    }
    static boolean isPrime(int num) {
        // if(num<2){
        //     return false;
        // }
        if(num == 2){
            return true;
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
                return true;
            }
            else{
                return false;
            }
        }
        }
}
