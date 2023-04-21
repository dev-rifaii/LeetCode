package leetcode.Easy;

public class NumberComplement {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        int sum = 0;
        boolean leadingZeros = true;

        for (int i = 0; i < binary.length(); i++) {
            if (leadingZeros) {
                if (binary.charAt(i) == '0') {
                    leadingZeros = false;
                } else {
                    continue;
                }
            }
            double pow = Math.pow(2, binary.length() - i - 1);
            if (binary.charAt(i) != '1') {
                sum += (pow * 1);
            } else {
                sum += (pow * 0);
            }
        }
        return sum;
    }
}
