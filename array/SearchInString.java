public class SearchInString {
    public static void main(String[] args) {
        String str = "vicky";
        char target = 'v';
        System.out.println(search(str, target));
    }

    static boolean search(String str, char target) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
