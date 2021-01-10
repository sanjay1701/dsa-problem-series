package array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/** Given an array A{} having duplicate values, print elements in array having count more than 2
 * @author sanjay
 *
 */
public class PrintMultipleOccurenceInArray {

	/** function to print unique elements in array whose count is more than 2
	 * @param arr - array
	 * @param len - length of array
	 */
	public static void printMultipleOccurenceArray(int[] arr, int len) {
		int j=0;
		Integer count=0;
		List<Integer> num = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Map<Integer, Integer> map = new TreeMap<>();
		for(Integer i : num) {
			count = map.containsKey(i) ? map.put(i, count)+1 : 1;
			map.put(i, count);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>=2){
				System.out.print(entry.getKey() + " ");
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = {2,2,4,4,6,6,8,8,1,3,5,2,8,7,9};
		int len = arr.length;
		printMultipleOccurenceArray(arr,len);
	}
}
