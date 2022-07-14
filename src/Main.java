import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s ="(){()[{[)}]}";
        boolean str = str(s);
        System.out.println(str);
    }

    public static boolean str(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.length() % 2 == 0) {
                char x = s.charAt(i);
                if (x == '(' || x == '{' || x == '[') {
                    stack.push(x);
                }
                if ((x == ')' && stack.empty()) || (x == '}' && stack.empty()) || (x == ']' && stack.empty()))
                    return false;
                if (stack.isEmpty())
                    return false;
                char check;
                switch (x) {
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
                        if (check == '{' || check == '(')
                            return false;
                        break;
                }
            } else return false;
        }return (stack.isEmpty());


    }



    ///////////////////////////2-usul
//             if(s == null || s.isEmpty() || s.length() % 2 != 0) return false;
//    final Stack<Character> stack = new Stack<Character>();
//    int index = 0;
//        while(index < s.length()) {
//        char curr = s.charAt(index);
//        if(!stack.empty() && (
//                (curr == ']' && stack.peek() == '[') ||
//                        (curr == '}' && stack.peek() == '{') ||
//                        (curr == ')' && stack.peek() == '(')
//        )) {
//            stack.pop();
//        } else {
//            stack.push(curr);
//        }
//        index++;
//    }
//
//        return stack.empty();
//}


}
