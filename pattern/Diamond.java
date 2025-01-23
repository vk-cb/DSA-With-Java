public class Diamond {
    public static void main(String[] args) {
        PatternDiamond(3);
    }

    static void PatternDiamond(int row) {
        for (int i = 1; i <= row * 2 - 1; i++) {
            // spaces
            int spaces = i <= row ? row - i : i - row;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // stars
            int stars = i <= row ? 2 * i - 1 : 2 * (row * 2 - i) - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

