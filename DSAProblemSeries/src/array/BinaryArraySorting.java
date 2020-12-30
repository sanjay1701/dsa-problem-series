package array;

public class BinaryArraySorting {

	/** Given a binary array A[] of size N. Program to arrange the array in increasing order.
	 * @param arr
	 * @param n - array length
	 */
	static void binSort(int arr[], int n){
		int j = 0;
		for(int i = 0 ; i < n ; i++) {
			if(arr[i]==0) {
				arr[i] = arr[i]+arr[j];
				arr[j] = arr[i]-arr[j];
				arr[i] = arr[i]-arr[j];
				j++;
			}
		}
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	public static void main(String[] args) {

		int[] arr = {1,0,1,1,0};
		binSort(arr, arr.length);
	}
}
