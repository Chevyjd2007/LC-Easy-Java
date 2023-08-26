import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String example = "";

        Boolean answer = valid(example);

        System.out.println(answer);
    }

    public static boolean valid(String s) {
        Stack<Character> model = new Stack<>();
            // Iterating through the entire length of s to check each of its characters
            for (int i = 0; i < s.length(); i++) {
                // If we encounter an open character, then we push it to the stack
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    model.push(s.charAt(i));
                    /* If we encounter an open statement in s while model is not empty and
                     * the last element in the stack is an open statement of the same type,
                     * then we pop the latest character from the stack.
                     */
                } else if (s.charAt(i) == ')' && model.size() > 0 && model.peek() == '(') {
                    model.pop();
                } else if (s.charAt(i) == ']' && model.size() > 0 && model.peek() == '[') {
                    model.pop();
                } else if (s.charAt(i) == '}' && model.size() > 0 && model.peek() == '{') {
                    model.pop();
                }
                // If we don't encounter any of the open brackets, we just return false
                else {
                    return false;
                }
            }
        // We return a boolean dictating if whether or not the stack model is empty.
        return model.isEmpty();
    }
}
