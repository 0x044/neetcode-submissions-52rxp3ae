class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        if(s.length() == 1 && s.charAt(0) != t.charAt(0)){
            return "";
        }
        HashMap<Character, Integer> tmap = new HashMap<>();
        for(char c : t.toCharArray()){
            tmap.put(c, tmap.getOrDefault(c, 0)+1);
        }
        
        int minLeft = 0, minRight = 0,have = 0,left = 0,  minLen = Integer.MAX_VALUE;
        int need = tmap.size();
        HashMap<Character, Integer> smap = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            char curr = s.charAt(right);
            smap.put(curr, smap.getOrDefault(curr, 0)+1);

            if(tmap.containsKey(curr) && Objects.equals(smap.get(curr), tmap.get(curr))){
                have++;
            }

            while(need == have){
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                    minRight = right;
                }
                char leftChar = s.charAt(left);
                smap.put(leftChar, smap.get(leftChar)-1);
                if(tmap.containsKey(leftChar) && smap.get(leftChar) < tmap.get(leftChar)){
                    have--;
                }
                left++;
            }
        }

        if(minLen == (Integer.MAX_VALUE)){
            return "";
        }

        return s.substring(minLeft, minRight+1);

    }
}