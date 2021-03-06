package chapter2_exercise501to1000.section9_exercise901to950;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*给定一副牌，每张牌上都写着一个整数。
        此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
        每组都有 X 张牌。
        组内所有的牌上都写着相同的整数。
        仅当你可选的 X >= 2 时返回 true*/

public class Ex914_XOfAKindInADeckOfCards_2 {
    //先计算每种不同数字卡牌各有多少张。如果要实现分组，则不同数字的卡牌张数之间必须有一个不为1的最大公约数
    //测试用例时间打败6.64?  原因系  hashmap在这里完全可以用一个较大数组代替，使用hashmap处理数据导致效率大幅降低
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck==null||deck.length<2)return false;
        //先统计张数
        Map<Integer,Integer> numsMap= new HashMap<>();
        for(int i=0;i<deck.length;i++){
            Integer nums=numsMap.get(deck[i])==null?1:numsMap.get(deck[i])+1;
            numsMap.put(deck[i],numsMap.get(deck[i])==null?1:numsMap.get(deck[i])+1);
        }
        //寻找最大公约数
        int temp=-1;
        for(int a:numsMap.values()){
            if(temp!=-1) {
                temp = gcdWork(a, temp);
            }else{
                temp=a;
            }
        }
        if(temp==1)return false;
        return true;
    }
    public int gcdWork(int x,int y){
        if(x%y==0)return y;
        return gcdWork(y,x%y);
    }
}
