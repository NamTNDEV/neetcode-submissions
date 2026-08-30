class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for(int i = 0; i < res.length(); i++) {
            char c = res.charAt(i);
            for(int j = 1; j < strs.length; j++) {
                String str = strs[j];
                if ((i == str.length()) || str.charAt(i) != c) {
                    return res.substring(0, i);
                } 
            }
        }

        return res;
    }
}