class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prePro = new int[nums.length];
        int[] sufPro = new int[nums.length];
        int[] res = new int[nums.length];

        prePro[0] = nums[0];
        sufPro[0] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            prePro[i] = prePro[i - 1] * nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            sufPro[i] = sufPro[i - 1] * nums[nums.length - 1 - i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                res[i] = sufPro[nums.length - 2 - i];
            else if (i == nums.length - 1)
                res[i] = prePro[i - 1];
            else {
                res[i] = prePro[i - 1] * sufPro[nums.length - i - 2];
            }
        }

        return res;
    }
}
