class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        
        for(int weight:weights ){
            low=Math.max(weight,low);
            high+=weight;
        }
        int ans=low;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(calCapacity(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public boolean calCapacity(int[] weights, int days,int mid){
        int count=1,sum=0;
        for(int weight:weights){
            if(sum+weight<=mid){
                sum+=weight;
            }
            else{
                count++;
                sum=weight;
            }

        }
        return count<=days;
    }
}