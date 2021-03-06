package chapter1_exercise1to500.section5_exercese201to250;
/*
Given an integer, write a function to determine if it is a power of two.

Example 1:

Input: 1
Output: true
Explanation: 20 = 1
Example 2:

Input: 16
Output: true
Explanation: 24 = 16
Example 3:

Input: 218
Output: false
* */
public class Ex231_PowerOfTwo_2 {
    //基本位运算 不使用二分

    //用时1ms 击败100%  时间复杂度 O(30)
    public boolean isPowerOfTwo(int n) {
        if(n<1)return false;
        if(n==1)return true;
        int base=1;
       for(int i=1;i<31;i++){
           base=base<<1;
           if(n<base){
               return false;
           }else if(n==base){
               return true;
           }
       }
       return false;
    }
}
