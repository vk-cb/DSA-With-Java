import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of array elements are: "+sum);
    }
}
