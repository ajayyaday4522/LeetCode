class Solution {
    public void sortColors(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        int k = nums.length - 1;

        for (int i = nums.length - 1; i >= j; i--) {
            if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k--;
            }
        }
    }
}