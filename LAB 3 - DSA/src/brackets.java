import java.util.*;
public class brackets {
    static boolean balance(String expr)
    {
        Stack<Character> brackets = new Stack<Character>();
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' ){
                brackets.push(x);
                continue;
            }
            else if (x == '['){
                brackets.push(x);
                continue;
            }
            else if (x == '{'){
                brackets.push(x);
                continue;
            }
            if (brackets.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = brackets.pop();
                    if (check == '{')
                        return false;
                    else if (check == '[')
                        return false;
                    break;
                case '}':
                    check = brackets.pop();
                    if (check == '(')
                        return false;
                    else if (check == '[')
                        return false;
                    break;
                case ']':
                    check = brackets.pop();
                    if (check == '(')
                        return false;
                    else if (check == '{')
                        return false;
                    break;
            }
        }
        return (brackets.isEmpty());
    }
    public static void main(String[] args)
    {
        String expr = "([]";
        if (balance(expr))
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");
    }
}