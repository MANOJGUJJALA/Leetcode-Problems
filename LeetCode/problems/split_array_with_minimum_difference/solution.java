class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        if (n < 2) return -1;
        
        // Precompute if each prefix is strictly increasing
        boolean[] isIncreasing = new boolean[n];
        isIncreasing[0] = true;
        for (int i = 1; i < n; i++) {
            isIncreasing[i] = isIncreasing[i-1] && (nums[i] > nums[i-1]);
        }
        
        // Precompute if each suffix is strictly decreasing
        boolean[] isDecreasing = new boolean[n];
        isDecreasing[n-1] = true;
        for (int i = n-2; i >= 0; i--) {
            isDecreasing[i] = isDecreasing[i+1] && (nums[i] > nums[i+1]);
        }
        
        // Calculate prefix sums
        long[] prefixSum = new long[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        
        // Calculate suffix sums
        long[] suffixSum = new long[n];
        suffixSum[n-1] = nums[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i+1] + nums[i];
        }
        
        long minDiff = Long.MAX_VALUE;
        boolean foundValidSplit = false;
        
        // Try all split points (split after index i, so left = 0..i, right = i+1..n-1)
        for (int i = 0; i < n-1; i++) {
            // Check if left part is strictly increasing AND right part is strictly decreasing
            if (isIncreasing[i] && isDecreasing[i+1]) {
                long diff = Math.abs(prefixSum[i] - suffixSum[i+1]);
                minDiff = Math.min(minDiff, diff);
                foundValidSplit = true;
            }
        }
        
        return foundValidSplit ? minDiff : -1;
    }
}