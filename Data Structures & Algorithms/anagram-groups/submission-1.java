class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str:strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }

        return map.values().stream().toList();
    }
}
