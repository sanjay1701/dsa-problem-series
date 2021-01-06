package array;

import java.util.ArrayList;
import java.util.List;

/** Program to find Maximal difference in an array
 * @author sanjay
 *
 */
public class MaximalDiffrence {

	/**
	 * @param arr
	 * @param arr_size
	 * @return maximum difference between any arr[i] and arr[j] where i<j and arr[i] < arr[j]
	 */
	int maxDiff(Integer[] arr, int arr_size) {

		int max_diff = 0;
		int i, j;
		for (i = 0; i < arr_size;)
		{
			for (j = i + 1; j < arr_size; i++,j++)
			{
				if(i<j && arr[i]<arr[j]) {
					max_diff = arr[j] - arr[i];
					break;
				}
			}
			break;
		}
		return max_diff;

	}
	public static void main(String[] args) {
		MaximalDiffrence maxdif = new MaximalDiffrence();
		List<Integer> numList = new ArrayList<>();
		numList.add(4);
		numList.add(3);
		numList.add(1);
		numList.add(5);

		Integer[] array = new Integer[numList.size()];
		array = numList.toArray(array);
		System.out.println("Maximum differnce is " +
				maxdif.maxDiff(array, 4));
	}
}
