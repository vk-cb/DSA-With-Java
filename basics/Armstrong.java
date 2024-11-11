import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int isArmNumber = 0;
        int temp = num;
        int length = String.valueOf(num).length(); 

        while (num != 0) {
            int digit = num % 10;
            isArmNumber += Math.pow(digit, length);
            num /= 10;
        }

        return temp == isArmNumber;
    }
}

