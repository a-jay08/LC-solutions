class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ans=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int n:nums1){
            ans.add(n);
        }
        for(int n:nums2){
            if(ans.contains(n)){
                res.add(n);
            }
        }
        int[] result=new int[res.size()];
        int i=0;
        for(int n:res){
            result[i++]=n;
        }
        return result;
    }
}