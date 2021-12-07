package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
* @author sachin
* @date 25-Oct-2021
*/

public class CheckParenthesis {

	public static void main(String[] args) {
		String str = "(9*8)+!(1-2)-[7/2]";
		
		boolean result = check(str);
		System.out.println(result ? "correct" : "Incorrect");

	}

	private static boolean check(String str) {
		
		List<Character> charsOpening = Arrays.asList('{', '[', '(');
		List<Character> charsClosing = Arrays.asList('}', ']', ')');
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put(']', '[');
		map.put(')', '(');
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			if (charsOpening.contains(str.charAt(i))) {
				stack.push(str.charAt(i));
			}
			
			if (charsClosing.contains(str.charAt(i))) {
				
				if (stack.isEmpty()) {
					return false;
				}
				
				if (stack.peek() == map.get(str.charAt(i))) {
					stack.pop();
				}
			}
			
		}

		return stack.isEmpty();
	}

}


