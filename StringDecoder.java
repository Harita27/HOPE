import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // e.g. 261#
        String decoded = decodeString(input);
        System.out.println(decoded);
    }

    public static String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            // Priority 1: Two-digit followed by '#'
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2));
                if (num >= 10 && num <= 26) {
                    result.append((char) ('A' + num - 1)); // Uppercase A–Z
                    i += 3;
                    continue;
                }
            }

            // Priority 2: One-digit followed by '#'
            if (i + 1 < s.length() && s.charAt(i + 1) == '#') {
                int num = s.charAt(i) - '0';
                if (num >= 1 && num <= 9) {
                    result.append((char) ('A' + num - 1)); // Uppercase A–I
                    i += 2;
                    continue;
                }
            }

            // Priority 3: Two-digit number (10–26), no '#'
            if (i + 1 < s.length() && Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i + 1))) {
                int num = Integer.parseInt(s.substring(i, i + 2));
                if (num >= 10 && num <= 26) {
                    result.append((char) ('a' + num - 1)); // Lowercase j–z
                    i += 2;
                    continue;
                }
            }

            // Priority 4: One-digit number
            if (Character.isDigit(s.charAt(i))) {
                int num = s.charAt(i) - '0';
                if (num >= 1 && num <= 9) {
                    result.append((char) ('a' + num - 1)); // Lowercase a–i
                }
                i++;
            } else {
                i++; // skip non-digit
            }
        }

        return result.toString();
    }
}
