import java.util.Scanner;

public class GreatestThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int first = scanner.nextInt();
        System.out.print("Enter the second number:");
        int second = scanner.nextInt();
        System.out.print("Enter the third number:");
        int third = scanner.nextInt();
        // if(first>=second && first>=third){
        // System.out.print("The greatest number is: " + first);
        // }
        // else if(second>=first && second>=third){
        // System.out.print("The greatest number is: " + second);
        // }
        // else{
        // System.out.print("The greatest number is: " + third);
        // };

        int temp = first > second ? first : second;
        int fAns = temp > third ? temp : third;
        System.out.println("The greatest number is: " + fAns);
    }
}
