class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squared = new long[n];
        for (int i = 0; i < n; i++) {
            squared[i] = (long) nums[i] * nums[i];
        } 
        Arrays.sort(squared);
        int m = n / 2;
        long ans = 0;
        for (int i = 0; i < m; i++) {
            ans -= squared[i];
        }
        for (int i = m; i < n; i++) {
            ans += squared[i];
        }
        return ans;
    }
}