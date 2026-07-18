class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                max=Math.max(max,st.size());
                if(st.size()>0){
                    st.pop();
                }
            }
        }return max;
    }
}