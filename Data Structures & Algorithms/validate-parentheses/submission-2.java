class Solution {
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        int slen = s.length();
        for (int i=0;i<slen;i+=1){
            if (charArray[i] == '(' || charArray[i] == '[' || charArray[i] == '{'){
                stack.push(charArray[i]);
            }
            if (charArray[i] == ')' || charArray[i] == ']' || charArray[i] == '}'){
                char lookfor = ' ';
                if (charArray[i] == ')') {
                    lookfor = '(';
                }
                if (charArray[i] == ']') {
                    lookfor = '[';
                }
                if (charArray[i] == '}') {
                    lookfor = '{';
                }
                if (stack.size()==0){
                    return false;
                }
                if (stack.peek() == lookfor){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        if (stack.size()==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}
