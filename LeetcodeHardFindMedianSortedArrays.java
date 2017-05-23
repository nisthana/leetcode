public class LeetcodeHardFindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) return 0.0;
        int[] merged = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        
        if (nums1.length > 0 && nums1.length > 0) {
            while (i<nums1.length && j<nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    merged[k] = nums1[i];
                    i++;
                } else {
                    merged[k] = nums2[j];
                    j++;
                }
                k++;
            }
            while (i<nums1.length){
                merged[k] = nums1[i];
                    i++;k++;
            }
            while (j<nums2.length){
                merged[k] = nums2[j];
                    j++;k++;
            }
             return findMed(merged);
        } else if (nums1.length > 0 && nums2.length == 0) {
            return findMed(nums1);
        } else if (nums1.length == 0 && nums2.length > 0) {
            return findMed(nums2);
        }
        return 0.0;
        
       
        
    }
    private double findMed(int[] merged) {
        int mid = merged.length/2;
        if (merged.length % 2 == 0) {
            int n1 = merged[mid-1];
            int n2= merged[mid];
            return (double)(n1+n2)/2;
        } else {
            return merged[mid];
        }
    }
}