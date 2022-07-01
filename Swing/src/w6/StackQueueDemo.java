package w6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueDemo {
	public static void main(String[] args) {
//		Stack<Integer> stack = new Stack<>();
//		
//		stack.push(1);stack.push(2);stack.push(3);
//		
//		System.out.println(stack.peek());//3
//		System.out.println(stack.pop());//3
//		System.out.println(stack.peek());//2

		Queue<Integer> q = new LinkedList<>();

		q.add(1);
		q.add(2);
		q.add(3);

		System.out.println(q.remove());// 1
		System.out.println(q.remove());// 2
		System.out.println(q.remove());// 3
	}
}
