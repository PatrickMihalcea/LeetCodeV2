
public class ValidPalindrome_125 {
    public static boolean Solution(String s) {
        s= s.toLowerCase();
        StringBuilder forwards = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                forwards.append(c);
            }
        }

        return forwards.toString().equals((forwards.reverse().toString()));
    }
}