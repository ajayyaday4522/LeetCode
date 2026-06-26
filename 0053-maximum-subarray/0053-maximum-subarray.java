class Solution {

    public int maxSubArray(int[] nums) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        if (largest < 0) {
            return largest;
        }

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum < 0) {
                currSum = 0;
            } else {
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }
}