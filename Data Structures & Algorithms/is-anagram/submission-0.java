
class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sarr = s.toCharArray();
        Arrays.sort(sarr);
        char[] tarr = t.toCharArray();
        Arrays.sort(tarr);
        
        if(new String(sarr).equals(new String(tarr))){
            return true;
        }

        return false;
    }
}
