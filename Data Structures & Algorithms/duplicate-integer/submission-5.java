class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> myset = new HashSet<>();

        for(int i : nums){
            if(!(myset.add(i)))
                return true;
        }

        return false;
    }
}