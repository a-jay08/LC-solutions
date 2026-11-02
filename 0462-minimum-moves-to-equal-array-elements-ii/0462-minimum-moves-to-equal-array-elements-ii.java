class Solution {
    public int minMoves2(int[] nums) {
        int sum=0;
        int median;
        int n=nums.length;
        Arrays.sort(nums);
        if(n%2==0){
            median=nums[n/2];
        }
        else{
            median=nums[n/2];
        }
        for(int i=0;i<n;i++){
            sum+=Math.abs(nums[i]-median);
        }
        return sum;
    }
}