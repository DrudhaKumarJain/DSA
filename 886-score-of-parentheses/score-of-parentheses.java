class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        int flag=0,ans=0,l;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
                flag=0;
            }
            else if(s.charAt(i)==')'){
                if(flag==0){
                    l=stack.size();
                    ans+=Math.pow(2,l-1);
                } 
                stack.pop();
                flag=1;    
            }
            
        }
        return ans;
    }
}