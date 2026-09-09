class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m, p2 = 0;
        while(p1 < nums1.length && p2 < n) {
            nums1[p1++] = nums2[p2++];
        }
        Arrays.sort(nums1);
    }
}