import java.util.Scanner;

public class SecondLargestmethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]>secondLarge && arr[i]<largest){
                secondLarge = arr[i];
            }
        }
        System.out.println("Secoond Largest element in an array: "+ secondLarge);
    }
}
