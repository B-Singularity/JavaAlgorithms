package stack;

import java.util.EmptyStackException;

public class Stack<E> {

	private ListNode<E> top;
	private int length;

	private static class ListNode<E> {
		private E data;
		private ListNode<E> next;

		private ListNode(E data) {
			this.data = data;
		}
	}

	public Stack() {
		top = null;
		length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void push(E data) {
		ListNode<E> temp = new ListNode<>(data);
		temp.next = top;
		top = temp;
		length++;
	}

	public E pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		E result = top.data;
		top = top.next;
		length--;
		return result;
	}

	public E peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.push(25);

		System.out.println(stack.peek());
	}
}

