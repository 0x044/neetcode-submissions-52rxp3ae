class Solution {
    public String minWindow(String s, String t) {
        int minLen = 1001;
        String res = "";
        HashMap<Character, Integer> tmap = new HashMap<>();
        for(char c : t.toCharArray()){
            tmap.put(c, tmap.getOrDefault(c, 0)+1);
        }
        
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                int len = j - i +1, match = 0;

                String sub = s.substring(i, j+1);
                HashMap<Character, Integer> submap = new HashMap<>();

                for(char c : sub.toCharArray()){
                    submap.put(c, submap.getOrDefault(c, 0)+1);
                }

                for(Map.Entry<Character, Integer> e : tmap.entrySet()){
                    char key = e.getKey();

                    if(tmap.get(key) <= submap.getOrDefault(key, 0)){
                        match++;
                    }
                }

                if(match == tmap.size()){
                    if(len < minLen){
                        minLen = len;
                        res = s.substring(i, j+1);
                    }
                }
            }
        }

        return res;
    }
}
