class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            merge[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            merge[nums1.length + i] = nums2[i];
        }
        Arrays.sort(merge);
        int n = merge.length;
        double result = 0;
        if (n % 2 == 0) {
            int left = merge[n / 2 - 1];
            int right = merge[n / 2];
            result = (left + right) / 2.0;
        } else {
            result = merge[n / 2];
        }
        return result;
    }
}