package Stack;


	import java.util.LinkedList;


	public class StringReverser {
		public static String reverseString(String input) {
			LinkedList<Character> stack = new LinkedList<Character>();
			for(char c : input.toCharArray()) {
				stack.push(c);
			}
			StringBuilder reversedString = new StringBuilder();
			while(!stack.isEmpty()) {
				reversedString.append(stack.pop());
			}
				return reversedString.toString();
		
		}
		
		public static void main(String[] args) {
			String input = "Hello World!";
			String output = reverseString(input);
			System.out.println(output);
		}

	}