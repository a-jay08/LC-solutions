class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        int[] arr=new int[128];
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(arr[ch]>0) {
                arr[s.charAt(left)]--;
                left++;
            }
            arr[ch]++;
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}