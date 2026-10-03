class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l = new ArrayList<>();
        for(String s:strs){
            if(l.isEmpty()) {
                l.add(new ArrayList<>());
                l.get(0).add(s);
            }
            else{ 
                int flag=0;
                for(int i = 0; i < l.size(); i++){
                    if(s.length() == l.get(i).get(0).length() && isAnagram(s,l.get(i).get(0))){
                        l.get(i).add(s);
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                l.add(new ArrayList<>());
                l.get(l.size()-1).add(s);
                }
            }
        }
        return l;
    }
    public Boolean isAnagram(String s,String l){
        if (s.length() != l.length()) {
        return false;
    }
    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[l.charAt(i) - 'a']--;
    }
    for (int x : count) {
        if (x != 0) {
            return false;
        }
    }
    return true;
    }
}