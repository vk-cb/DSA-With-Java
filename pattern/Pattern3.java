public class Pattern3 {
    public static void main(String[] args) {
        PatternFunction4(4);
    }
    static void PatternFunction3(int row){
       
        for (int i = 1; i <=row; i++) {
            //formula => row-i+1;
            for (int j = 1; j <= row-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void PatternFunction4(int row){
       
        for (int i = 1; i <=row; i++) {
            //formula => j<row;
            // 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
