package Algorithms;

import java.util.Arrays;

public class MergeSort {

	/** Recursive calls for both the sub-arrays to break into a single array:
	 * @param arr
	 * @param n
	 */
	public static void merge(int[] arr, int n) {
		if(n==1) {
			return;
		}
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];

		for(int i=0; i<mid; i++) {
			left[i]=arr[i];
		}

		for(int i=mid; i<n; i++) {
			right[i-mid] = arr[i];
		}

		merge(left, mid);
		merge(right, n-mid);

		mergeSort(arr,left,mid,right,n-mid);
	}


	/** Compares the elements of both sub-arrays one by one and places the smaller element into the input array.
	 * 	When we reach the end of one of the sub-arrays,
	 *  the rest of the elements from the other array are copied into the input array thereby giving us the final sorted array:
	 * @param arr
	 * @param left
	 * @param leftSize
	 * @param right
	 * @param rightSize
	 */
	public static void mergeSort(int[] arr, int[] left, int leftSize, int[] right, int rightSize) {
		int i=0,j=0,k=0;
		while(i<leftSize && j<rightSize) {
			if(left[i]<=right[j]) {
				arr[k++] = left[i++];
			}
			else {
				arr[k++] = right[j++];
			}
		}

		while(i<leftSize) {
			arr[k++] = left[i++];
		}
		while(j<rightSize) {
			arr[k++] = right[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr = {4,1,5,8,2,9};
		int len = arr.length;
		merge(arr,len);
		Arrays.stream(arr).forEach(i-> System.out.println(i));
	}
}
