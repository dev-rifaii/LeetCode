package leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/minimum-index-sum-of-two-lists/
public class MinimumIndexSumOfTwoLists {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> values = new ArrayList<>();
        int currentMinimum = -1;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (currentMinimum == -1 || i + j < currentMinimum) {
                        currentMinimum = i + j;
                        values.clear();
                        values.add(list1[i]);
                    } else if (currentMinimum == i + j) {
                        values.add(list1[i]);
                    }
                }
            }
        }
        return values.toArray(new String[0]);
    }
}
