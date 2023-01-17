package Algorithms;

public class BinarySearch {
    /** find the element in sorted array using Binary search and print it
     * @param arr - should be in ascending or descending order
     */
    static int binarySearch(int[] arr,int target){
        int start =0,end=arr.length-1;
        while (start<=end){
            int mid = end - (end-start)/2;
                if(arr[mid]<target)
                    start = mid+1;
                else if(arr[mid]>target)
                    end = mid-1;
                else
                    return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,20,23,33,45,50,66,73,87,99};
        System.out.println(binarySearch(arr,33));
    }
}
