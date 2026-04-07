class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> dupe = new HashSet<>();

        for(int n: nums){
            if(!(dupe.add(n)))
                return true;
        }

        return false;
    }
}