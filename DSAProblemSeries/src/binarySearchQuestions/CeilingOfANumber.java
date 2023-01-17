package binarySearchQuestions;

public class CeilingOfANumber {

    /**
     * https://leetcode.com/problems/search-insert-position/description/
     * @param nums
     * The ceiling function of a real number is the least integer number greater than or equal to the given number.
     * Example - The Ceiling of 2.31 is 3
     */
    public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while (start<=end){
            int mid = end - (end-start)/2;
            if(nums[mid]<target)
                start = mid + 1;
            else if(nums[mid]>target)
                end = mid-1;
            else
                return mid;
        }
            return end+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,5));
        System.out.println(searchInsert(arr,2));
        System.out.println(searchInsert(arr,7));
        System.out.println(searchInsert(arr,0));
    }
}
