import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int [] ReversedArray;
        for (int i = 0; i < arr.length; i++) {
            ReversedArray = new int[arr.length];
            ReversedArray[i] = arr[arr.length - 1 - i];
            System.out.print(ReversedArray[i] + " ");
        }
    }
}
