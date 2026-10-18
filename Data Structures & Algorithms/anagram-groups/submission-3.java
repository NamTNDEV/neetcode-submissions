class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();

        for(String str:strs) {
            List<Integer> key = new ArrayList<>(Collections.nCopies(26, 0));
            for (char c : str.toCharArray()) {
                int index = c - 'a';
                key.set(index, key.get(index) + 1);
            }

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }   

        return map.values().stream().toList();
    }
}