import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class stack_demo {

    public boolean isValid (String s) {
        if ("".equals(s)||s.length()==0) return true;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars){
            if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (c == '(') stack.push(')');
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }
    @Test
    public void test01(){
        System.out.println(isValid(""));
        System.out.println(isValid("()"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{()}"));
        System.out.println(isValid("({[})]"));
    }
}
