import java.util.Stack;
import java.util.HashMap;


// Runtime complexity: O(n)
// The solutions were pretty similar. I thought I needed to use stack because the
//concepts said "stack and queues". Although it did take me longer than 30 minutes to
//get through the problem.
//It would be pretty similar as a queue. Specifically a Linked List. We would put the opening
//bracket in the queue when we come across one. Then if we come across a closing one, see if it
//matches the front of queue. It would still be O(n).
public class BalancedBrackets {

        public static boolean areBracketsBalanced(String input) {
            Stack<Character> stack = new Stack<>();
            HashMap<Character, Character> bracketPairs = new HashMap<>();
            bracketPairs.put('(', ')');
            bracketPairs.put('{', '}');
            bracketPairs.put('[', ']');
            bracketPairs.put('<', '>');

            for (char c : input.toCharArray()) {
                if (bracketPairs.containsKey(c)) {

                    stack.push(c);
                } else if (bracketPairs.containsValue(c)) {

                    if (stack.isEmpty() || bracketPairs.get(stack.pop()) != c) {
                        return false;
                    }
                }
            }


            return stack.isEmpty();
        }

        public static void main(String[] args) {
            String balancedString1 = "({[<>]})";
            String balancedString2 = "[{()}]";
            String unbalancedString = "({[}])";

            boolean isBalanced1 = areBracketsBalanced(balancedString1);
            boolean isBalanced2 = areBracketsBalanced(balancedString2);
            boolean isBalanced3 = areBracketsBalanced(unbalancedString);

            System.out.println("Is balancedString1 balanced? " + isBalanced1);
            System.out.println("Is balancedString2 balanced? " + isBalanced2);
            System.out.println("Is unbalancedString balanced? " + isBalanced3);
        }
    }



