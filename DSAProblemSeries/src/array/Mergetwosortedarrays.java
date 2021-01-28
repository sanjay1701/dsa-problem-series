package array;

import java.util.Arrays;

public class Mergetwosortedarrays {

	/** Merge two sorted arrays with O(1) extra space
	 * @param ar1
	 * @param ar2
	 */
	private static void getMergedArray(int[] ar1, int[] ar2) {
		int j,i,temp;
		for(i=ar2.length-1;i>=0;i--) {
			temp = ar1[ar1.length-1];
			for(j=ar1.length-2;j>=0 && ar2[i]<ar1[j];j--) {
				ar1[j+1] = ar1[j];
			}
			if(j!=ar1.length-2 || temp>ar2[i]) {
				ar1[j+1] = ar2[i];
				ar2[i] = temp;
			}
		}
		Arrays.stream(ar1).forEach(k-> System.out.print(k + " "));
		System.out.println();
		Arrays.stream(ar2).forEach(k-> System.out.print(k + " "));
	}


	public static void main(String[] args) {

		int[] ar1 = {1, 5, 9, 10, 15, 20};
		int[] ar2 = {2, 3, 8, 13};
		getMergedArray(ar1,ar2);
	}
}
