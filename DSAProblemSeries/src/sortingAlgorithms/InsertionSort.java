package sortingAlgorithms;

public class InsertionSort {

	/** sort the given array using Insertion sort and print it
	 * @param arr
	 */
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i=1;i<n;++i) {
			int key = arr[i];
			int j = i-1;

			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = key;
		}
	}

	public static void main(String[] args) {

		int[] arr = {9, 5, 10, 2, 15, 1};
		insertionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
