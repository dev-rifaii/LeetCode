package leetcode.Easy;

//https://leetcode.com/problems/excel-sheet-column-number/
public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int num = columnTitle.charAt(columnTitle.length() - 1) - 64;
        if (columnTitle.length() > 1) {
            for (int i = 0; i < columnTitle.length() - 1; i++) {
                num += Math.pow(26, (columnTitle.length() - 1) - i) * (columnTitle.charAt(i) - 64);
            }
        }
        return num;
    }
}