public class Pattern3 {
    public static void main(String[] args) {
        PatternFunction7(4);
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
    static void PatternFunction5(int row){
     
        for (int i = 1; i <=row*2; i++) {
            //formula => j<row;
            // stars = i <= row ? row : row*2-i
            int stars = i <= row ? i : row*2-i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void PatternFunction6(int row){
     
        for (int i = 1; i <=row; i++) {
           // print space
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
           // print star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void PatternFunction7(int row){
     
        for (int i = 1; i <=row; i++) {
           // print space
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
           // print star
            for (int j = 1; j <=row-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
