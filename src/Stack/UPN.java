package Stack;
 
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class UPN {
 
	public static int calculateUPN(String input) {
		LinkedList<Integer> stack = new LinkedList<>();
		// Pattern f�r mathematische Grundrechnungsarten
		Pattern operatorPattern = Pattern.compile("[+*-/]");
		// Pattern f�r ganze Zahlen: \\d... Ziffer [0;9]
		Pattern numericPattern = Pattern.compile("\\d+");
 
		// \\s+... beliebig viele Leerzeichen
		for(String token : input.split("\\s+")) {
			Matcher operatorMatcher = operatorPattern.matcher(token);
			Matcher numericMatcher = numericPattern.matcher(token);
			if(numericMatcher.matches()) {
				stack.push(Integer.parseInt(token));
			}else if(operatorMatcher.matches()) {
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				int result = 0;
				switch(token) {
				case "+": result = operand1 + operand2;
					break;
				case "-": result = operand2 - operand1;
					break;
				case "*": result = operand1 * operand2;
					break;
				case "/": result = operand2 / operand1;
					break;
				default: System.out.println("Falscher Operator");
				}
				stack.push(result);
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		String str = "11 22 *";
		System.out.println(calculateUPN(str));
	}
}