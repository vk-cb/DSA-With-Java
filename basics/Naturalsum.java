import java.util.Scanner;
 public class Naturalsum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number natural number : ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum of "+n+" natural numbers is "+ sum);
        }
 }