class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=i+1;
        while(j<nums.length){
            while(nums[i]==nums[j]){
                j++;
                if(j>=nums.length)break;
            }
            if(j>=nums.length)break;
            i++;
            nums[i]=nums[j];
            
        }
        return i+1;
    }
}