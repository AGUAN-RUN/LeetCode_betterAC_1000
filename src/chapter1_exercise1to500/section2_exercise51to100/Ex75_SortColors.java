package chapter1_exercise1to500.section2_exercise51to100;
/* 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
   此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。*/
/*
给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。

 

进阶：

你可以不使用代码库中的排序函数来解决这道题吗？
你能想出一个仅使用常数空间的一趟扫描算法吗？
 

示例 1：

输入：nums = [2,0,2,1,1,0]
输出：[0,0,1,1,2,2]
示例 2：

输入：nums = [2,0,1]
输出：[0,1,2]
示例 3：

输入：nums = [0]
输出：[0]
示例 4：

输入：nums = [1]
输出：[1]
 

提示：

n == nums.length
1 <= n <= 300
nums[i] 为 0、1 或 2


* */
public class Ex75_SortColors {
    public void sortColors(int[] nums) {
        //两趟扫描算法
        int[]colorNums=new int[3];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                colorNums[0]++;
            }else if(nums[i]==1){
                colorNums[1]++;
            }else{
                colorNums[2]++;
            }
        }
        int j=0;
        for(int i=0;i<colorNums.length;i++){
            while(colorNums[i]>0){
                nums[j++]=i;
                colorNums[i]--;
            }
        }

    }
}
