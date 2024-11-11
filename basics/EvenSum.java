import java.util.Scanner;

public class EvenSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no of even number");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;
       while(i<n){
        // System.out.println(i);
        // if(i%2==0){
            sum+=2*i;
            System.out.println(sum);  
            i++;
        // }

        
       }
       System.out.println("Sum of "+n+" even number is "+sum);
    }
}