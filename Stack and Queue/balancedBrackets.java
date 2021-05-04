import java.util.*;

public class balancedBrackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                boolean res = handleClosing(stack, '(');
                if (res == false) {
                    System.out.println(res);
                    return;
                }
            } else if (c == '}') {
                boolean res = handleClosing(stack, '{');
                if (res == false) {
                    System.out.println(res);
                    return;
                }
            } else if (c == ']') {
                boolean res = handleClosing(stack, '{');

                if (res == false) {
                    System.out.println(res);
                    return;
                }
            } else {

            }
        }
        if (stack.size() == 0) {
            System.out.println(true);

        } else {
            System.out.println(false);

        }
    }

    public static boolean handleClosing(Stack<Character> stack, char ch) {
        if (stack.size() == 0) {

            return false;
        } else if (stack.peek() != ch) {
            return false;
        } else {
            stack.pop();
            return true;
        }
    }
}