class Solution {
    public boolean canPartition(int[] nums) {

        // Step 1: Calculate total sum
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        // Step 2: If sum is odd, equal partition is impossible
        if (sum % 2 != 0) {
            return false;
        }

        // Step 3: Calculate target
        int target = sum / 2;

        // Step 4: Create DP array
        boolean[] dp = new boolean[target + 1];

        // Step 5: Base case
        dp[0] = true;

        // Step 6: Tabulation
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            for (int j = target; j >= num; j--) {

                dp[j] = dp[j] || dp[j - num];

            }
        }

        // Step 7: Return answer
        return dp[target];
    }
}
