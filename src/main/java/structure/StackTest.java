package structure;

import java.util.Stack;
import java.util.Vector;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<Integer>();
        //判断栈是否为空
        System.out.println(integerStack.empty());
        //压栈
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(2);
        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(6);

        //查询栈顶值，但是不取出
        System.out.println(integerStack.peek());
        System.out.println(integerStack.peek());
        System.out.println(integerStack.peek());

        //查询而且取出
        System.out.println(integerStack.pop());
        System.out.println(integerStack.peek());
        //查询某个值在栈中以栈顶为“1” 时的相对位置
        //若是栈中没有这个值，将会返回-1
        System.out.println(integerStack.search(6));
    }
}
