class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        int j,k,n=nums.length;
        for(int i=0;i<n-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            j=i+1;
            k=n-1;
            while(j<k){
                int sum=nums[j]+nums[k];
                if(sum==-nums[i]){
                    List<Integer> set=new ArrayList<>();
                    set.add(nums[i]);
                    set.add(nums[j]);
                    set.add(nums[k]);
                    ans.add(set);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                       j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                       k--;
                    }
                }
               else if(sum>-nums[i]){
                k--;
               }
                else{
                 j++;
              }
            }
        }
        return ans;
    }
}