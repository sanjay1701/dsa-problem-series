package array;

import java.util.HashSet;
import java.util.Set;

/** Program to Find Union of two unsorted arrays and print count and contents of it
 * @author sanjay
 *
 */
public class Unionof2arrays {

	public static void main(String[] args) {

		int[] arr1 = {85, 25, 1, 32, 54, 6};
		int[] arr2 = {32, 8, 6, 20, 7};

		//Approach - 1
		/*		int count = 0, i=0,j=0;
		java.util.Map<Integer,Integer> map1 = new TreeMap<Integer, Integer>();
		while(i<arr1.length) {
			count = map1.containsKey(arr1[i]) ?  map1.get(arr1[i]) : 0;
			map1.put(arr1[i], ++count);
			i++;
		}
		while(j<arr2.length) {
			count = map1.containsKey(arr2[j]) ? map1.get(arr2[j])+1 : 1;
			map1.put(arr2[j], count);
			j++;
		}

		System.out.println(map1.keySet().size());
		for(int a: map1.keySet()) {
			System.out.print(a + " ");
		}*/

		//Approach - 2  (Use TreeSet if we want values to be sorted)
		Set<Integer> set = new HashSet<>();
		for(Integer a : arr1) {
			set.add(a);
		}
		for(Integer b : arr2) {
			set.add(b);
		}

		System.out.println(set.size());
		System.out.println(set);
	}
}
