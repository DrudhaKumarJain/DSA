class Solution {
    public void moveZeroes(int[] nums) {
      int n=nums.length,i=0;
      if (n<=1)return;
      for(int j=1;j<n;j++){
        if(nums[i]==0){
            if (nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }else i++;
      }   
    }
}