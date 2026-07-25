class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ele=new HashSet<>();
        int i=0,max=0;
        for(int j=0;j<s.length();j++){
           char ch=s.charAt(j);
            while(ele.contains(ch)){
                ele.remove(s.charAt(i));
                i++;
            }
            ele.add(ch);
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}