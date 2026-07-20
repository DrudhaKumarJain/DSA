class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                sum+=calBeauty(s,i,j);
            }
        }
        return sum;
    }
    public int calBeauty(String s,int left,int right){
        int[] arr=new int[26];
        for(int i=left;i<=right;i++){
            arr[s.charAt(i)-'a']+=1;
        }

        int max = arr[0];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {
           if (arr[i] > 0) {
              max = Math.max(max, arr[i]);
              min = Math.min(min, arr[i]);
            }
        }
        return max-min;


    }
}