package DZ_15102022;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String myS = "the sky is blue";
        System.out.println(reverseWords(myS));
    }

    public static String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        int i = s.length() - 1;
        int start = i + 1;
        int end = i + 1;
        String result = "";

        while (i >= 0) {
            if (s.charAt(i) == ' ' || i == 0) {
                if (i == 0) {
                    start = i;
                } else {
                    start = i + 1;
                }
                while (start != end)
                    result += s.charAt(start++);
                if (i != 0) {
                    result += " ";
                }
                end = i;
            }
            i--;
        }
        // result = result.replaceAll("\\s+", " ");
        return result.trim();

    }
}
