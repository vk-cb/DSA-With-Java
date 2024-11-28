public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4},{3,5,6},{7,8,9}};
        int target = 6;
        int[] result = searchElement(arr, target);
        if (result[0] == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(target + " found at position: [" + result[0] + ", " + result[1] + "]");
        }
    }

    static int[] searchElement(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; 
    }
}