class Solution {
    public int rob(int[] nums) {
        int max=0;
        int previous=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i]+(i>=2 ? max:0);
            int current=Math.max(previous,sum);
            max=previous;
            previous=current;
        }
        return previous;
    }
}