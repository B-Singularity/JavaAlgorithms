package stack;

import java.util.Stack;

public class ParenthesesProblem {

	boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					char top = stack.peek();
					if ((c == ')' && top == '(') ||
						(c == '}' && top == '{') ||
						(c == ']' && top == '[')) {
						stack.pop();
					} else {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		ParenthesesProblem parenthesesProblem = new ParenthesesProblem();
		String str = "[[]]";
		String wrongStr = "[[";
		System.out.println(parenthesesProblem.isValid(str));
		System.out.println(parenthesesProblem.isValid(wrongStr));
	}
}
