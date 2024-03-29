package stackAndQueue_03;

import java.util.Stack;
//     ====03====
public class kuohao {
    private Stack<Character> stack = new Stack<Character>();
    public boolean isValid(String s ){
       for (int i = 0 ; i < s.length() ; i++){
           char c = s.charAt(i);
           if (c == '(' || c == '{' || c == '['){
               stack.push(c);
           }else {
               if (stack.isEmpty()){
                   return false;
               }
               char topChar = stack.pop();
               if (c == ')' && topChar != '('){
                   return false;
               }
               if (c == '}' && topChar != '{'){
                   return false;
               }
               if (c == '{' && topChar != '['){
                   return false;
               }
           }
       }
       return stack.isEmpty();
    }
}
