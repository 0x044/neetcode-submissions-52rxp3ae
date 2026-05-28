class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> s1map = new HashMap<>();
        for(char c : s1.toCharArray()){
            s1map.put(c, s1map.getOrDefault(c, 0)+1);
            
        }
        if(s1.length() > s2.length()){
            return false;
        }
        int left=0;
        HashMap<Character, Integer> s2map = new HashMap<>();

        for(int right = s1.length()-1; right < s2.length(); right++){
            for(char c : s2.substring(left, right+1).toCharArray()){
                s2map.put(c, s2map.getOrDefault(c, 0)+1);
            }

            if(s1map.equals(s2map)){
                return true;
            }
            s2map.clear();
            left++;
        }

        return false;
    }
}
