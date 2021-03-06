package chapter1_exercise1to500.section2_exercise51to100;

/*给定两个二进制字符串，返回他们的和（用二进制表示）。
        输入为非空字符串且只包含数字 1 和 0*/
/*待优化*/
/*
给你两个二进制字符串，返回它们的和（用二进制表示）。

输入为 非空 字符串且只包含数字 1 和 0。

 

示例 1:

输入: a = "11", b = "1"
输出: "100"
示例 2:

输入: a = "1010", b = "1011"
输出: "10101"
 

提示：

每个字符串仅由字符 '0' 或 '1' 组成。
1 <= a.length, b.length <= 10^4
字符串如果不是 "0" ，就都不含前导零。


* */
public class Ex67_AddBinary {
    public String addBinary(String a, String b) {
        int lengthA=a.length();
        int lengthB=b.length();
        int flag=0;
        int value=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<Integer.MAX_VALUE;i++){
            if(i<lengthA&&i<lengthB){
                value=(int)a.charAt(lengthA-i-1)+(int)b.charAt(lengthB-i-1)-96+flag;
                flag=value/2;
                value=value%2;
                sb.append(value);
            }else if(i<lengthA){
                value=(int)a.charAt(lengthA-i-1)-48+flag;
                flag=value/2;
                value=value%2;
                sb.append(value);
            }else if(i<lengthB){
                value=(int)b.charAt(lengthB-i-1)-48+flag;
                flag=value/2;
                value=value%2;
                sb.append(value);
            }else{
                break;
            }
        }
        if(flag==1)sb.append(1);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a="1010";
        String b="1011";
        System.out.println(new Ex67_AddBinary().addBinary(a,b));
    }
}
