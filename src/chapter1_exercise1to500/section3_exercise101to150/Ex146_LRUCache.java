package chapter1_exercise1to500.section3_exercise101to150;

import java.util.*;

/*
Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

The cache is initialized with a positive capacity.

Follow up:
Could you do both operations in O(1) time complexity?*/
/*
运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制 。
实现 LRUCache 类：

LRUCache(int capacity) 以正整数作为容量 capacity 初始化 LRU 缓存
int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
void put(int key, int value) 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字-值」。当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
 

进阶：你是否可以在 O(1) 时间复杂度内完成这两种操作？

 

示例：

输入
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
输出
[null, null, null, 1, null, -1, null, -1, 3, 4]

解释
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // 缓存是 {1=1}
lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
lRUCache.get(1);    // 返回 1
lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
lRUCache.get(2);    // 返回 -1 (未找到)
lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
lRUCache.get(1);    // 返回 -1 (未找到)
lRUCache.get(3);    // 返回 3
lRUCache.get(4);    // 返回 4
 

提示：

1 <= capacity <= 3000
0 <= key <= 3000
0 <= value <= 104
最多调用 3 * 104 次 get 和 put


* */
// 用时336ms 击败5%      内存消耗47.6M 击败100%
public class Ex146_LRUCache {
    private int capacity;
    private Map<Integer,Integer>map=new HashMap<>();
    private List<Integer> arrayList=new ArrayList<>();

    public Ex146_LRUCache(int capacity) {
        this.capacity=capacity;
    }

    public int get(int key) {
        Integer result=this.map.get(key);
        if(result==null){
            return -1;
        }
        arrayList.remove((Integer)key);
        arrayList.add((Integer)key);
        return result;
    }
    public void put(int key, int value) {
        if(arrayList.size()==capacity&&!map.containsKey(key)){
            Integer rm=arrayList.remove(0);
            arrayList.add(key);
            map.remove(rm);
        }else if(!map.containsKey(key)){
            arrayList.add(key);
        }else {
            arrayList.remove((Integer)key);
            arrayList.add((Integer)key);
        }
        map.put(key,value);
    }
}
