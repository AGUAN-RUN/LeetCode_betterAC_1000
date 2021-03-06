package chapter1_exercise1to500.section6_exercese251to300;
/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
* */

/*
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

示例:

输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
说明:

必须在原数组上操作，不能拷贝额外的数组。
尽量减少操作次数。


* */
public class Ex283_MoveZeroes {
    //用时0ms  击败100%  时间复杂度 O（n） 空间复杂度 O（1）
    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length==0)return;
        //从左往右遍历数组  遇到不是0的放 num[left]  left指向数组下一个元素
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(left!=i){
                    nums[left]=nums[i];
                }
                left++;
            }
        }
        //left 之后的全部
        for(int i=left;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
