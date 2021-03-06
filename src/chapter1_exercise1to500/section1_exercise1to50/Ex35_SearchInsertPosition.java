package chapter1_exercise1to500.section1_exercise1to50;
/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

你可以假设数组中无重复元素。

示例 1:

输入: [1,3,5,6], 5
输出: 2
示例 2:

输入: [1,3,5,6], 2
输出: 1
示例 3:

输入: [1,3,5,6], 7
输出: 4
示例 4:

输入: [1,3,5,6], 0
输出: 0


* */
public class Ex35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0||nums[0]>=target)return 0;
        int length=nums.length;
        if(nums[length-1]<target)return length;
        if(nums[length-1]==target)return length-1;
        int lt=0;
        int rt=length-1;
        int temp;
        while(rt>lt+1){
            temp=(rt+lt)/2;
            if(nums[temp]==target)return temp;
            if(nums[temp]>target){
                rt=temp;
            }else{
                lt=temp;
            }
        }
        return rt;
    }
}
