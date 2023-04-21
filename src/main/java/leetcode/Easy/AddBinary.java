package leetcode.Easy;

//https://leetcode.com/problems/add-binary/
public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        short remainder = 0;
        short sum = 0;

        int max = Math.max(a.length(), b.length());
        int diff = max - Math.min(a.length(), b.length());

        for (int i = max - 1; i >= 0; i--) {
            sum = 0;
            if (a.length() != max) {
                if (i - diff >= 0) sum += (short) (Character.getNumericValue(a.charAt(i - diff)));
            } else sum += (short) (Character.getNumericValue(a.charAt(i)));

            if (b.length() != max) {
                if (i - diff >= 0) sum += (short) Character.getNumericValue(b.charAt(i - diff));
            } else sum += (short) Character.getNumericValue(b.charAt(i));

            sum += remainder;
            remainder = 0;

            switch (sum) {
                case 0 -> sb.insert(0, 0);
                case 1 -> sb.insert(0, 1);
                case 2 -> {
                    sb.insert(0, 0);
                    remainder++;
                }
                case 3 -> {
                    sb.insert(0, 1);
                    remainder++;
                }
            }
        }

        return remainder == 0 ? sb.toString() : sb.insert(0, 1).toString();
    }
}
