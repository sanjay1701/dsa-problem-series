package array;

/** Program to sort an array of 0, 1 and 2's
 * @author sanjay
 *
 */
public class ThreewayPartionUsingDucthNationalFlag {
	/** Function to sort an array of 0, 1 and 2's
	 * @param arr
	 * @param n - array length
	 *
	 */

	//Approach 1-
	public static void sort012(int[] arr, int n) {
		int low=0,mid=0,high=n-1;
		while(mid<=high) {
			switch(arr[mid]) {
			case 0:{
				arr[mid] = arr[mid]+arr[low];
				arr[low] = arr[mid]-arr[low];
				arr[mid] = arr[mid]-arr[low];
				mid++;low++;
				break;
			}
			case 1:
				mid++; break;
			case 2:
			{
				arr[mid] = arr[mid]+arr[high];
				arr[high] = arr[mid]-arr[high];
				arr[mid] = arr[mid]-arr[high];
				high--;
				break;
			}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

		//Approach 2 -
		/*while(mid<=high) {
			if(arr[mid]==2) {
				arr[mid] = arr[mid]+arr[high];
				arr[high] = arr[mid]-arr[high];
				arr[mid] = arr[mid]-arr[high];
				high--;
			}
			else if(arr[mid]==0) {
				arr[mid] = arr[mid]+arr[low];
				arr[low] = arr[mid]-arr[low];
				arr[mid] = arr[mid]-arr[low];
				mid++;low++;
			}
			else if(arr[mid]==1) {
				mid++;
			}

		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}*/
	}
	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sort012(arr,arr.length);
	}
}
