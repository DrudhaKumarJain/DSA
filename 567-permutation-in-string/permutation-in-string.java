class Solution {
    public boolean checkInclusion(String s1, String s2) {
       HashMap<Character,Integer> map=new HashMap<>();
       int n=s2.length(),m=s1.length();
       for(int i=0;i<m;i++){
        map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
       }
       int j;
       for(int i=0;i<=n-m;i++){
        if(!map.containsKey(s2.charAt(i))) continue;
        j=i+m-1;
        HashMap<Character,Integer> map1 = new HashMap<>(map);
        int k = i;
    while (k <= j && map1.containsKey(s2.charAt(k))) {
        map1.put(s2.charAt(k), map1.get(s2.charAt(k)) - 1);

        if (map1.get(s2.charAt(k)) == 0) {
            map1.remove(s2.charAt(k));
        }
        k++;
    }

        if(map1.isEmpty())
        return true;
       }
       return false;
    }
}