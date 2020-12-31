package array;

/** Given array with consecutive distinct values 1 to n, program to find minimum number of swaps to arrange array in sorted manner
 * @author sanjay
 *
 */
public class MinimumSwapSortArray {

	/** Function to find value of minimum swaps to sort an array
	 * @param arr
	 * @return minimum swap
	 */
	static int minimumSwaps(int[] arr) {
		int minSwap = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]!=i+1) {
				while(arr[i]!=i+1) {
					int temp = arr[arr[i]-1];
					arr[arr[i]-1] = arr[i];
					arr[i] = temp;
					minSwap++;
				}
			}
		}
		return minSwap;
	}

	public static void main(String[] args) {

		int[] arr = {7, 1, 3, 2, 4, 5, 6};
		int minSwap = minimumSwaps(arr);
		System.out.println(minSwap);
	}
}
