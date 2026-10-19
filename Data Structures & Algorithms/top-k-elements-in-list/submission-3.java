class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, List<Integer>> frequentMap = new TreeMap<>(Collections.reverseOrder());

        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        map.forEach((key, value) -> {
            frequentMap.computeIfAbsent(value, v -> new ArrayList<>()).add(key);
        });

        int i = 0;
        for (var entry : frequentMap.entrySet()) {
            if (i == k) break;
            for(Integer a : entry.getValue()) {
                list.add(a);
                i++;
                if (i == k) break;
            }
        }

        int[] result = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }

        return result;
    }
}
