class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE;
        int high=0;
        
        for(int num:nums ){
            low=Math.max(num,low);
            high+=num;
        }
        int ans=low;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(calSum(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public boolean calSum(int[] nums, int k,int mid){
        int count=1,sum=0;
        for(int num:nums){
            if(sum+num<=mid){
                sum+=num;
            }
            else{
                count++;
                sum=num;
            }

        }
        return count<=k;
    }
}