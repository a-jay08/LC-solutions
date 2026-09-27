class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int num=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=0)
                continue;

            if(nums[i]==num)
                continue;

            if(nums[i]!=num+1)
              return num+1;

               num=nums[i];
        }
       return num+1;
    }
}