class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int n=temperatures.length;
        int[]  res=new int[n];
        for(int i=0;i<n;i++){
            if(s.empty())s.push(i);
            else{
                if(temperatures[s.peek()]>temperatures[i]){
                    s.push(i);
                    continue;
                }
                while(!s.empty()&&temperatures[s.peek()]<temperatures[i]){
                    int ind=s.pop();
                    res[ind]=i-ind;
                }
                s.push(i);
            }
        }
        return res;
    }
}
