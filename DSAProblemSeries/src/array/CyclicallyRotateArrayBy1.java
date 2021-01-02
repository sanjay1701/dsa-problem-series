package array;

/** Given an array, cyclically rotate an array by one.
 * @author sanjay
 *
 */
public class CyclicallyRotateArrayBy1 {

	/** Function to cyclically rotate array by 1
	 * @param arr
	 * @param n
	 */
	public static void rotate(int[] arr, int n) {
		int val = arr[n-1];
		for(int i=n-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0]=val;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " " );
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		rotate(arr,arr.length);
	}
}
