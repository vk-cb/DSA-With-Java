import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int nthterm = in.nextInt();
        in.close();
        if(fibonacci(nthterm)==-1){
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }
        else{
            System.out.println("The " + nthterm + "th term of the Fibonacci sequence is: " + fibonacci(nthterm));
        }
    }
    static int fibonacci(int nterm) {
        int a = 0, b= 1, next;
        if(nterm<=0){
            return -1;
        }
        else if(nterm==1){
            return 0;
        }
        else if(nterm == 2){
            return 1;
        }
        else{
            for (int i = 3; i <=nterm; i++) {
                next = a + b;
                a = b;
                b = next;
            }
            return b;
        }
    }
}
