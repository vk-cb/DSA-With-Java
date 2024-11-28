public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {85,48,5,69,57};
        int target = 6;
        int result = linearSearch(arr, target);
        if(result == -1){
            System.out.println(target+ " is not found in the given array");
        }else{    
        System.out.println(target+ " is found at index "+ result);
        }
        }
        static int linearSearch(int[] array, int target){
            int index = -1;
            for (int i = 0; i<array.length; i++){
                if(array[i]==target){
                    index = i;
                }
            }
            return index;
        }
}