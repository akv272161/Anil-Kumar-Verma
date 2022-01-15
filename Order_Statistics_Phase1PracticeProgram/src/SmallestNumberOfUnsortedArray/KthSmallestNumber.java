package SmallestNumberOfUnsortedArray;

import java.util.Arrays;
import java.util.Collections;
 
class KthSmallestNumber {
    // Function to return k'th smallest
    // element in a given array
    public static int kthSmallest(Integer[] arr,int k)
    {
        // Sort the given array
        Arrays.sort(arr);
 
        // Return k'th element in
        // the sorted array
        return arr[k - 1];
    }
 
    // driver program
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19, 2, 21,13,11 };
        int k = 4;
        System.out.println("K'th smallest element is: " + kthSmallest(arr, k));
    }
}