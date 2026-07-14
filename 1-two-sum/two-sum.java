class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i,index;
        HashMap<Integer,Integer>ele=new HashMap<>();
            
        
        for(i=0;i<n;i++){
            if(ele.containsKey(target-nums[i])){
                index=ele.get(target-nums[i]);
                return new int[]{i,index};
            }
            ele.put(nums[i],i);
        }
        return new int[]{};
    }
}