package chapter1_exercise1to500.section5_exercese201to250;

import java.util.ArrayList;
import java.util.List;

/*
Count the number of prime numbers less than a non-negative number, n.

    Example:

    Input: 10
    Output: 4
    Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
    */
/*
统计所有小于非负整数 n 的质数的数量。

 

示例 1：

输入：n = 10
输出：4
解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
示例 2：

输入：n = 0
输出：0
示例 3：

输入：n = 1
输出：0
 

提示：

0 <= n <= 5 * 106


* */
public class Ex204_CountPrimes {
    //下面这个算法是正确的 但是运行超时了，没有AC成功  以下算法的时间复杂为  O(n^2)
    /*public int countPrimes(int n) {
        List<Integer>Primes=new ArrayList<>();
        int count=0;
        boolean isPrimes=true;
        for(int i=2;i<=n;i++){
            isPrimes=true;
            for(int a:Primes){
                if(i%a==0){
                    isPrimes=false;
                    break;
                }
            }
            if(isPrimes){
                Primes.add(i);
                count++;
            }
        }
        return count;
    }*/
    //埃拉托斯特尼筛法，简称埃氏筛或爱氏筛，是一种由希腊数学家埃拉托斯特尼所提出的一种简单检定素数的算法。
    // 要得到自然数n以内的全部素数，必须把不大于根号n的所有素数的倍数剔除，剩下的就是素数。

    //空间换时间
    //用时14ms  击败89%的提交
    public int countPrimes(int n) {
        boolean [] isNotPrimes=new boolean[n];//从2到n-1的n-1个数组下标代表2到n-1的每个整数，数组值为true代表该数是素数
        int max=(int)Math.sqrt(n);  //这里由于转化为int 向下取整 会有误差，所以用迭代是 i<=max 而不是 i<max
        for(int i=2;i<=max;i++){
            if(isNotPrimes[i]==false){
                int k=2;
                while (k*i<n){
                    isNotPrimes[k*i]=true;
                    k++;
                }
            }
        }
        int nums=0;
        //由于最小的质数是2
        for(int i=2;i<isNotPrimes.length;i++){
            if(isNotPrimes[i]==false)nums++;
        }
        return nums;
    }

    public static void main(String[] args) {
        Ex204_CountPrimes test=new Ex204_CountPrimes();
        test.countPrimes(10);
        System.out.println(Math.sqrt(7));
    }
}
