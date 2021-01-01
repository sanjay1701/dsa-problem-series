package array;

import java.util.HashSet;
import java.util.Set;

/** Program to Find Intersection of two unsorted arrays and print count and contents of it
 * @author sanjay
 * Concept used - Hashing
 */

public class IntersectionOf2Arrays {
	public static void main(String[] args) {
		int[] arr1 = {85, 25, 1, 32, 54, 6};
		int[] arr2 = {32, 8, 6, 20, 7};
		int count1=0;
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		for(Integer a : arr1) {
			set.add(a);
		}
		for(Integer b : arr2) {
			if(set.contains(b)) {
				count1++;
				set1.add(b);
			}
		}
		System.out.println(count1);
		System.out.println(set1);

	}
}
