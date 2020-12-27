package array;
class Pair{
	int min;
	int max;
}

/** Program to find minimum and maximum element in an array using minimum comparisons
 * @author sanjay
 *
 */
public class MinMaxInArrayUsingMinComparison {

	/**
	 * @param arr
	 * @param low - starting index of array
	 * @param high - last index of array
	 * @return {@code Pair} instance with minimum and maximum value
	 */
	public static Pair getMinMax(int[] arr, int low, int high) {

		Pair result = new Pair();
		Pair left = new Pair();
		Pair right = new Pair();

		//if array has only one element
		if(low==high) {
			result.min = arr[high];
			result.max = arr[high];
			return result;
		}

		//if array has only 2 elements
		if(high==low+1) {
			if(arr[low]>arr[high]) {
				result.min = arr[high];
				result.max = arr[low];
			}
			else {
				result.min = arr[low];
				result.max = arr[high];
			}
			return result;
		}

		//if array has more than 2 elements
		int mid = (low+high)/2;
		left = getMinMax(arr,0,mid);
		right = getMinMax(arr,mid+1,high);

		if(left.min<right.min)
			result.min = left.min;
		else result.min = right.min;

		if(left.max>right.max)
			result.max = left.max;
		else result.max = right.max;

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 6, 8, 1, 9, 12, 15, 11 };
		Pair result = getMinMax(arr,0,arr.length-1);
		System.out.println("Min element in array: " +result.min);
		System.out.println("Max element in array: " +result.max);
	}
}
