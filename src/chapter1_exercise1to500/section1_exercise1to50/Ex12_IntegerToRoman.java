package chapter1_exercise1to500.section1_exercise1to50;

public class Ex12_IntegerToRoman {
    public static String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            while (num >= nums[i]) {
                sb.append(romans[i]);
                num -= nums[i];
            }
        }
        return sb.toString();
    }
}
