package LeetCode;

/** Purpose: Encapsulates merge sort behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class MergeSort {
    
    /** Purpose: Performs the merge operation. */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] newList = new int[6];
        while (i < nums1.length && j < nums2.length) {
           if (nums1[i] < nums2[j]) {
                newList[k] = nums1[i];
                i++;
            } else {
                newList[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            newList[i] = nums1[j];
            i++;k++;
        }
        while(j<nums2.length){
            newList[k] = nums2[j];
            j++;k++;
        }

        for (int l = 0; l < newList.length; l++) {
            System.out.print(newList[l]+" ");
        }

    }

        public static void main(String[] str) {
        int[] nums1 = { 1, 2, 3};
        int m = nums1.length;
        int[] nums2 = { 2, 5, 6 };
        int n = nums2.length;
        MergeSort obj = new MergeSort();
        obj.merge(nums1, m, nums2, n);
    }
}