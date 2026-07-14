class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int j,index;
        HashMap<Integer,Integer>ele=new HashMap<>();
        for(int i=0;i<n;i++){
            ele.put(nums[i],i);
        }
        for(j=0;j<n;j++){
            if(ele.containsKey(target-nums[j]) && ele.get(target-nums[j])!=j){
                index=ele.get(target-nums[j]);
                return new int[]{j,index};
            }
        }
        return new int[]{};
    }
}