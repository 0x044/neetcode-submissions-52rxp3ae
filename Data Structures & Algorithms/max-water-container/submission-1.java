class Solution {
    public int maxArea(int[] arr) {
        int left = 0, right = arr.length - 1;

        int maxVol = 0;

        while(left < right){
            int currVolume = Math.min(arr[left], arr[right]) * (right-left);

            maxVol = Math.max(currVolume, maxVol);

            if(arr[left] < arr[right]){
                left++;
            }else if(arr[left] >= arr[right]){
                right--;
            }
        }

        return maxVol;
    }
}
