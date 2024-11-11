import java.util.Scanner;

public class RangeNatural {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: "+" ");
        int first = scanner.nextInt();
        System.out.print("Enter the Last number: "+" ");
        int last = scanner.nextInt();

        for (int i = first; i<last; i++){
            sum+=i;
        }

        System.out.print("The sum of all numbers between "+first+" and "+last+" is: "+sum);
      

    }
}

