package chapter1_exercise1to500.section5_exercese201to250;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Example:

MyStack stack = new MyStack();

stack.push(1);
stack.push(2);
stack.top();   // returns 2
stack.pop();   // returns 2
stack.empty(); // returns false
Notes:

You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
* */
/*
使用队列实现栈的下列操作：

push(x) -- 元素 x 入栈
pop() -- 移除栈顶元素
top() -- 获取栈顶元素
empty() -- 返回栈是否为空
注意:

你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。


* */
public class Ex225_ImplementStackUsingQueues {
    //如果用队列的话使用两个队列来倒卖就行
    private List<Integer> list1;
    /** Initialize your data structure here. */
    public Ex225_ImplementStackUsingQueues() {
         list1=new ArrayList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
         list1.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
         return list1.remove(list1.size()-1);
    }

    /** Get the top element. */
    public int top() {
        return list1.get(list1.size()-1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
         return list1.size()==0;
    }
}
