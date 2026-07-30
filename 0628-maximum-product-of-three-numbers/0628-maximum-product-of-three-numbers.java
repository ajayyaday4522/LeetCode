class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = nums[n-3] * nums[n-2] * nums[n-1];
        int j = nums[0] * nums[1] * nums[n-1];

        if(i > j){
            return i;
        } else {
            return j;
        }

    }
}