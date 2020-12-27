package array;

public class MininumSwapToSortArray {

	/** This code does minimum number of swaps to sort the array.
	 * @param arr
	 * @return int
	 */
	static int minimumSwaps(int[] arr) {
		int minSwap = 0;
		for (int i = 0; i < arr.length; i++) {
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
		int res = minimumSwaps(arr);
		System.out.println("Mnimum swaos to sort array: " +res);
	}
}
