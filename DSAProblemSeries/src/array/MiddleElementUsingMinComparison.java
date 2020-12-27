package array;

import java.util.Arrays;

/** Program to find middle element in an array using minimum comparisons
 * @author sanjay
 * @param - even and odd arrays
 */
public class MiddleElementUsingMinComparison {
	public static void main(String[] args) {
		int[] arr = {500,850,100,350};
		int[] arr1 = {250,350,800,900,500};
		MiddleElement mid = new MiddleElement();
		System.out.println(mid.middleElement(arr));
		System.out.println(mid.middleElement(arr1));
	}
}

class MiddleElement{
	/**
	 * @param array
	 * @return calculate middle element in an array
	 */
	int middleElement(int[] array) {
		Arrays.sort(array);
		int mid = (0+array.length-1)/2;
		return array[mid];
	}

}