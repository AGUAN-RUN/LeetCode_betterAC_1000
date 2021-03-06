package chapter1_exercise1to500.section3_exercise101to150;

import java.util.HashMap;
import java.util.Map;

/*Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

/*
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。

说明：

你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

示例 1:

输入: [2,2,3,2]
输出: 3
示例 2:

输入: [0,1,0,1,0,1,99]
输出: 99


* */
public class Ex137_SingleNumberII {
    //使用额外空间，用map来统计

    //用时6ma，击败27.3的用户
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> ns=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer time=ns.get(nums[i]);
            ns.put(nums[i],time==null?1:time+1);
        }
        for(int a:ns.keySet()){
            if(ns.get(a)==1)return a;
        }
        return -1;
    }
}
