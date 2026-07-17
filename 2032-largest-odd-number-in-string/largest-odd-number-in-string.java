class Solution {
    public String largestOddNumber(String num) {
        int i;
        for(i=num.length()-1;i>=0;i--){
            int odd=(int)num.charAt(i);
            if(odd%2!=0)break;
        }
        if(i==-1)
        return num.substring(0,0);
        else
         return num.substring(0,i+1);
    }
}