package Easy;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int satisfied = 0;

        for (int i = 0; i < g.length; i++) {
            int bestCookieIndex = -1;
            for (int j = 0; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    if (bestCookieIndex == -1 || s[j] < s[bestCookieIndex]) {
                        bestCookieIndex = j;
                    }
                }
            }
            if (bestCookieIndex > -1 && s[bestCookieIndex] >= g[i]){
                satisfied++;
                s[bestCookieIndex] = 0;
            }
        }
        return satisfied;
    }
}
