package chapter1_exercise1to500.section4_exercise151to200;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
*/
/*
给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。

说明:

返回的下标值（index1 和 index2）不是从零开始的。
你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
示例:

输入: numbers = [2, 7, 11, 15], target = 9
输出: [1,2]
解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。


* */
public class Ex167_TwoSumII_InputArrayIsSorted {
    //3ms  击败28.81% 优化优化
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> nums=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int value=target-numbers[i];
            if(nums.containsKey(value))return new int[]{nums.get(value),i+1};
            nums.put(numbers[i],i+1);
        }
        return new int[2];

    }
}

