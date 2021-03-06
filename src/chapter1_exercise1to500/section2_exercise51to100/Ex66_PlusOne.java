package chapter1_exercise1to500.section2_exercise51to100;
/*给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
        最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
        你可以假设除了整数 0 之外，这个整数不会以零开头。*/
/*
给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

 

示例 1：

输入：digits = [1,2,3]
输出：[1,2,4]
解释：输入数组表示数字 123。
示例 2：

输入：digits = [4,3,2,1]
输出：[4,3,2,2]
解释：输入数组表示数字 4321。
示例 3：

输入：digits = [0]
输出：[1]
 

提示：

1 <= digits.length <= 100
0 <= digits[i] <= 9


* */
public class Ex66_PlusOne {
    public int[] plusOne(int[] digits) {
        if(digits==null||digits.length==0)return null;
        //从个位开始增加1，如果加的结果是10，说明有进位，上一位加一，循环，如果最后首位进位，返回新的数组
        for(int i=digits.length-1;i>=0;i--){
            digits[i]=(digits[i]+1)%10;
            if(digits[i]!=0)return digits;
        }
        if(digits[0]==0){
            int[]result=new int[digits.length+1];
            result[0]=1;
            return result;
        }
        return null;
    }
}
