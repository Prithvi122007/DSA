class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char p;
        for(int i = 0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'|| ch=='[' || ch=='('){
                stack.push(ch);
            }
            else{
                if(stack.empty()){
                return false;
                }
                else{
                    p=stack.pop();
                    if(ch=='}'&& p=='{' || ch==']'&& p=='[' || ch==')' && p=='('){
                    }
                    else{
                        return false;
                    }
                }   
            }   
        }
        return stack.isEmpty();
    }
}