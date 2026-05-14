class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> mymap = new TreeMap<>();

        for(int n : nums){
            mymap.computeIfAbsent(n, k -> 0);
            mymap.computeIfPresent(n, (k, count) -> count+1);
        }

        int maxtotal = 0;
        int total = 0;
        int prevkey = -1;
        for(Map.Entry<Integer, Integer> entry : mymap.entrySet()){
            int currkey = entry.getKey();
            if(currkey == prevkey+1){
                total++;
                prevkey = currkey;
                if(total > maxtotal){
                    maxtotal = total;
                }
            }else{
                total = 1;
                prevkey = currkey;
            }
        }

        return maxtotal;

    }
}
