package day1;

public class MergeSortedArray {

    /**
     *
     * @param nums1 main array
     * @param m number of filled elements in first array
     * @param nums2 array to merge into main array
     * @param n number of elements in second array
     */

    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int mergeIndex = m + n - 1;


        while ( m > 0 && n > 0 ){
            if (nums1[m-1] < nums2[n-1]) {
                nums1[mergeIndex] = nums2[n-1];
                n --;
            } else {
                nums1[mergeIndex] = nums1[m-1];
                nums1[m-1] = 0;
                m --;
            }

            mergeIndex--;
        }

        while (n > 0) {
            nums1[mergeIndex] = nums2[n-1];
            n--;
            mergeIndex--;
        }

        return nums1;
    }

}
