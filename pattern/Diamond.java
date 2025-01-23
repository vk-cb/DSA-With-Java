public class Diamond {
    public static void main(String[] args) {
        PatternDiamond(4);
    }

    static void PatternDiamond(int row) {
        System.out.println();
        for (int i = 1; i <= row * 2 - 1; i++) {
            // spaces
            int spaces = i <= row ? row - i : i - row;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // stars
            int stars = i <= row ? i : 2*row-i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

