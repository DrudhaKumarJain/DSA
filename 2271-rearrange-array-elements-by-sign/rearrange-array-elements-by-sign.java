class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList();
        List<Integer> neg = new ArrayList(); 
        for (int num : nums) {
            if (num > 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(i%2 == 0) {
                nums[i] = pos.get(i/2);
            } else {
                nums[i] = neg.get(i/2);
            }
        }

        return nums;
    }
}