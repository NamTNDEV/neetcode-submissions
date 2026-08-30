class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = nums[0];
        for (int num : nums) {
            if (num == candidate) count++;
            else if (count == 0) candidate = num;
            else count--;
        }
        return candidate;
    }
}