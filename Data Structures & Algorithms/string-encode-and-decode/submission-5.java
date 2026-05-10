class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()+"#"+str);
        }

        return sb.toString();
    }

    public List<String> decode(String encoded) {
        int i = 0;
        List<String> result = new ArrayList<>();
        while(i < encoded.length()){
            int separator = encoded.indexOf('#', i);
            int len = Integer.parseInt(encoded.substring(i, separator));

            i = separator+1;

            result.add(encoded.substring(i, i+len));

            i+= len;
        }
        return result;
    }
}
