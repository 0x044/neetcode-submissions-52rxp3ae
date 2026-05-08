class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            int[] sign = new int[26];
            String cur = strs[i];
            for(int j = 0; j < cur.length(); j++){
                sign[cur.charAt(j) - 'a'] += 1;
            }

            map.computeIfAbsent(Arrays.toString(sign), k -> new ArrayList<String>()).add(cur);
        }

        List<List<String>> reslist = new ArrayList<>(map.values());

        return reslist;
    }
}
