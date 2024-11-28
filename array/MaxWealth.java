public class MaxWealth {
    public static void main(String[] args) {
        int [][] arr = {
            {124,457,685},
            {120,450,680},
            {122,455,687}
        };
        int maxWealth = getMaxWealth(arr);
        System.out.println("Maximum wealth of the person is : "+ maxWealth);
        }
        static int getMaxWealth(int[][] array){
            int maxWealth = Integer.MIN_VALUE;
            for(int i=0; i<array.length; i++){
                int rowSum = 0;
                for(int j=0; j<array[i].length; j++){
                    rowSum += array[i][j];
                }
                maxWealth = Math.max(maxWealth, rowSum);
            }
            return maxWealth;
        }
}
