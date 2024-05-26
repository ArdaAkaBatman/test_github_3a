package Stack;
import java.util.Stack;


public class BracketChecker {
    public static boolean areBracketsBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        // Loop through the characters in the expression
        for (char ch : expr.toCharArray()) {
            // If the current character is an opening bracket, push it to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }
            
            // If the stack is empty, there is an unbalanced closing bracket
            if (stack.isEmpty())
                return false;
            char check;
            switch (ch) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        // If the stack is not empty, there are unbalanced opening brackets
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String expression = "{()}[]";
        // Check if brackets are balanced
        boolean balanced = areBracketsBalanced(expression);
        if (balanced)
            System.out.println("Korrekte Klammerung");
        else
            System.out.println("Fehlerhafte Klammerung");
    }
}
