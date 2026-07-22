class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
       
        for(int num:nums){
            
            high=Math.max(high,num);
        }
         int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(calSumDiv(nums,threshold,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;

    }
    public boolean calSumDiv(int[] nums,int threshold,int mid){
        int sum=0;
        for(int num:nums){
            sum+=(num+mid-1)/mid;
        }
        return sum<=threshold;
        
    }
}