package array;

/** This program finds the kth smallest element in an array
 * @author sanjay
 *
 */
public class KthSmallestElement {

	/**
	 * @param arr - array to store elements
	 * @param low - start index of array
	 * @param high - last index of array
	 * @param k - index to find element
	 * @return - smallest element at the kth index
	 */
	static int kthSmallest(int[] arr, int low, int high, int k) {

		java.util.Arrays.sort(arr);
		return arr[k-1];

	}

	public static void main(String[] args) {

		int[] arr = {7, 10, 4, 3, 20, 15};
		int k = 3;
		System.out.println(kthSmallest(arr, 0, arr.length-1, k));
	}
}
