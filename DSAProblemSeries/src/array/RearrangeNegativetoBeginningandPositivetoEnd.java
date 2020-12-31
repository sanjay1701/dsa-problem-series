package array;

/** Program to Move all negative numbers to beginning and positive to end with constant extra space in an array (Order of elements not important)
 * @author sanjay
 *
 */
public class RearrangeNegativetoBeginningandPositivetoEnd {

	/** Function to rearrange all negative numbers to beginning and positive to end
	 * @param arr
	 * @param n - array length
	 */
	public static void rearrange(int[] arr, int n) {

		//Approach- 1
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				if(i!=j) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				j++;
			}
		}
		for(int i =0 ;i<n;i++) {
			System.out.print(arr[i] + " ");
		}

		//Approach - 2 (only to print negative and positive to left and right respectively to maintain respective insertion orders)
		/*
		for(int j=0;j<n;j++) {
			if(arr[j]<0) {
				System.out.print(arr[j] + " ");}
		}
		for(int k=0;k<n;k++) {
			if(arr[k]>0) {
				System.out.print(arr[k] + " ");}
		}
		 */	}
	public static void main(String[] args) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int n = arr.length;
		rearrange(arr,n);
	}
}
