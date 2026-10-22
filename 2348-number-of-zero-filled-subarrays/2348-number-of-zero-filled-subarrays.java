class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long zeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                zeros+=count;
            }
            else{
                count=0;
            }
        }
        return zeros;
    }
}