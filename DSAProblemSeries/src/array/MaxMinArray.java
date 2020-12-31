package array;

/** Pairs created to be returned from getMinMax() method having minimum and maximum element
 * @author sanjay
 *
 */
class Pairs{
	int min;
	int max;
}

public class MaxMinArray {

	/** This method finds the maximum and minimum value in an array
	 * @param arr
	 * @param n - array length
	 * @return - result with min and max value stored in it
	 */
	static Pairs getMinMax(int[] arr, int n) {
		Pairs result = new Pairs();

		if(n==1)
			result.min = arr[0]; result.max = arr[0];

			if(arr[0]>arr[1])
				result.min = arr[1];
			else result.max = arr[0];

			for(int i = 2; i<n-1; i=i+2) {
				if(arr[i]>arr[i+1]) {
					if(arr[i]<result.min)
						result.min = arr[i];
					if(arr[i]>result.max)
						result.max = arr[i];
				}
				else {
					if(arr[i+1]>result.max)
						result.max = arr[i+1];
					if(arr[i+1]<result.min)
						result.min = arr[i+1];
				}
			}
			return result;
	}

	public static void main(String[] args) {

		int[] arr = {500,-11,-200,800,930,650};
		Pairs result = getMinMax(arr,arr.length-1);
		System.out.println("Minimum elememt: " +result.min);
		System.out.println("Maximum element: " +result.max);
	}
}
