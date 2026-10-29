class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int cur = num;
                while (set.contains(cur + 1)) cur++;
                max = Math.max(max, cur - num + 1);
            }
        }
        return max;
    }
}
