import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int[] array = new int[n]; 

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        int maxNum = findMax(array);
        System.out.println("The largest number in the array is: " + maxNum);
        
        in.close(); 
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
}
