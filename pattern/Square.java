public class Square {
    public static void main(String[] args) {
        Pattern1(4);
    }
    static void Pattern1(int num){
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



