public class BinarySearch {
        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
            int target = 135;
            int i = binarySearch(arr, target);
            
            if (i == -1) {
                System.out.println("The given number is not found in the array.");
            } else {
                System.out.println("The given number is found at index: " + i);
            }
        }
        static int binarySearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
    
            while (start <= end) {
                int mid = start + (end - start) / 2; 
    
                if (arr[mid] == target) {
                    return mid; 
                } else if (arr[mid] < target) {
                    start = mid + 1; 
                } else {
                    end = mid - 1; 
                }
            }
    
            return -1; 
        }
    }

