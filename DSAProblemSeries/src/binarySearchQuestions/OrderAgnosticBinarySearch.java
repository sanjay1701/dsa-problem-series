package binarySearchQuestions;

public class OrderAgnosticBinarySearch {

    static int orderAgnosticBinarySearch(int[] arr,int target){
        int start=0,end=arr.length-1;

            while(start<=end){
                int mid = end + (start-end)/2;
                if(arr[mid]==target)
                    return mid;
                //find array is sorted in ascending or descending order (if descending run below if condition)
                if(arr[start]>arr[end]) {
                    if (target > arr[mid])
                        end = mid - 1;
                    else
                        start = mid + 1;
                }
                // if ascending order array will execute below piece of code
                else{
                    if(target<arr[mid])
                        end = mid - 1;
                    else
                        start = mid + 1;
                }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {90,75,18,12,6,4,3,1};
        int[] arr1 = {2,4,6,8,10,12,20,23,33,45,50,66,73,87,99};
        System.out.println("Descending Order Array Target Element Index : "+ orderAgnosticBinarySearch(arr,75));
        System.out.println("Ascending Order Array Target Element Index : " + orderAgnosticBinarySearch(arr1,33));
    }
}
