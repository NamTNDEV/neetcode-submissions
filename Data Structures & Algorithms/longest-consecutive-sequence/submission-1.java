class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = 1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1) && set.contains(num + 1)) {
                int count = 1;
                int cur = num;
                while (set.contains(cur + 1)) {
                    count++;
                    cur++;
                }


                max = Math.max(max, count);
            }
        }

        return max;
    }
}
