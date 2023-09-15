import java.util.Stack;



// Runtime complexity: O(n)
public class BalancedParentheses {

        public static boolean hasBalancedParentheses(String input) {
            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            String balancedString = "(a + b) - (c * d)";
            String unbalancedString = "(a + b) - (c * d))";

            boolean isBalanced1 = hasBalancedParentheses(balancedString);
            boolean isBalanced2 = hasBalancedParentheses(unbalancedString);

            System.out.println("Is balancedString balanced? " + isBalanced1);
            System.out.println("Is unbalancedString balanced? " + isBalanced2);
        }
    }



