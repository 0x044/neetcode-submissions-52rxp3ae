import java.util.Arrays;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]){
                flag = true;
                break;
            }
        }

        return flag;
    }
}

public class Runner{
    static void main(){
        Solution s = new Solution();
        int[] arr = {1, 2, 3};

        System.out.println(s.hasDuplicate(arr));
    }
}