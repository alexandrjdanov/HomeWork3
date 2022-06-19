import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
        String string[] = {"Lorem", "Ipsum", "is", "simply", "dummy", "text", "of", "the",
                "printing", "and", "typesetting", "industry"};

        System.out.println(Arrays.toString(string));
        int max = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i].length() > string[max].length())
                max = i;
        }
        System.out.println("\nThe longest word is: "  + string[max]);
    }
}
