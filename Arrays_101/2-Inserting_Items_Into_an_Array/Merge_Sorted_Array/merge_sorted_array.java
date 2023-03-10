class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n -1, bp1 = m-1, bp2 = n-1; // --> i == index; bp == back pointer
        
        while(bp1 >= 0 && bp2 >= 0){
            if(nums1[bp1] > nums2[bp2]) nums1[i] = nums1[bp1--];
            else nums1[i] = nums2[bp2--];
            i--;
        }
        while(bp1 >= 0) nums1[i--] = nums1[bp1--];
        while(bp2 >= 0) nums1[i--] = nums2[bp2--];
    }
}
