class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> resmap = new HashMap<>();

        for(int i : nums){
            resmap.putIfAbsent(i, 0);
            int count = resmap.get(i)+1;
            resmap.put(i, count);
        }

        List<Map.Entry<Integer, Integer>> sorter = new ArrayList<>(resmap.entrySet());

        sorter.sort((a, b) -> {
            if (a.getValue() > b.getValue()) {
                return -1;
            } else if(a.getValue().equals(b.getValue())){
                return 0;
            }else {
                return 1;
            }
        });

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = sorter.get(i).getKey();
        }

        return result;
 
    }
}
