class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1])
                flag = true;
        }

        return flag;
    }
}