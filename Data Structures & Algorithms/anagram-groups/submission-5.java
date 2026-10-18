class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] key = new int[26];
            for (char c : str.toCharArray()) {
                int index = c - 'a';
                key[index]++;
            }

            map.computeIfAbsent(Arrays.toString(key), k -> new ArrayList<>()).add(str);
        }

        return new ArrayList(map.values());
    }
}