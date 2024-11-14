import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int min = findMin(arr);
        int max = findMax(arr);
        System.out.println("Smallest number in the array: " + min);
        System.out.println("Largest number in the array: " + max);
    }
    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) { 
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
