package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        byte[] stemp = s.getBytes();
        byte[] ttemp = t.getBytes();
        Arrays.sort(stemp);
        Arrays.sort(ttemp);
        for (int i = 0; i < stemp.length; i++) {
            if (!(stemp[i] == ttemp[i])) {
                return false;
            }
        }
        return true;
    }
}
