package Easy;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean firstIsUppercase = word.charAt(0) < 91;
        boolean lastIsUppercase = word.charAt(word.length() - 1) < 91;
        if (!firstIsUppercase && lastIsUppercase) return false;

        for (int i = 1; i < word.length() - 1; i++) {
            if ((word.charAt(i) > 91 && lastIsUppercase && firstIsUppercase)
                    || (word.charAt(i) < 91 && !firstIsUppercase)
                    || word.charAt(i) < 91 && !lastIsUppercase) return false;
        }

        return true;
    }
}
