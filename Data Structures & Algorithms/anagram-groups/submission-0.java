class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str:strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            if(!map.containsKey(sortedKey)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedKey, list);
            } else {
                List<String> list = map.get(sortedKey);
                list.add(str);
                map.put(sortedKey, list);
            }
        }

        map.forEach((k, v) -> {
            result.add(v);
        });

        return result;
    }
}
