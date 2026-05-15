class Solution {
    public boolean isPalindrome(String s) {
        String stripped = new StringBuilder(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()).reverse().toString();
        
        if(stripped.equals(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase())){
            return true;
        }

        return false;
    }
}
