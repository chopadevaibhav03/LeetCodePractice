package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    /*
    LINEAR SEARCH APPROACH
    public int search(int[] nums, int target){

        for (int i=0;i<nums.length;i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    */

    // BINARY SEARCH APPROACH 

    public int search(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;

        while (low < high){
            int mid = low + (high - low)/2;
            if (nums[mid] < target){
                low = mid+1;
            }else {
                high = mid;
            }
        }
        return nums[low] == target ? low : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int n = sc.nextInt();
        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        System.out.println("Enter Array Element: ");
        int[] nums = new int[n];
        for (int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        BinarySearch bs = new BinarySearch();
        int result = bs.search(nums,target);
        System.out.println("Target element found at index:" +result);
    }
}
