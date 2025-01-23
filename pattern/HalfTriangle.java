public class HalfTriangle {
    public static void main(String[] args) {
        Pattern2(4);
    }
    static void Pattern2(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
