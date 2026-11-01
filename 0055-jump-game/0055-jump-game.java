class Solution {
    public boolean canJump(int[] nums) {
        int initial=0;
        int last=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(i>initial){
                return false;
            }
            initial=Math.max(initial,i+nums[i]);
            if(initial>=last){
                return true;
            }
        }
        return true;
    }
}