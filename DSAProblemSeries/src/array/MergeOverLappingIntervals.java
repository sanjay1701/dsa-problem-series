package array;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeOverLappingIntervals {
	/** Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals
	 * @param intervals
	 * @return an array of the non-overlapping intervals that cover all the intervals in the input.
	 */
	public static int[][] merge(int[][] intervals) {

		//Approach - 1
		/*List<int[]> result = new ArrayList<>();
		if(intervals == null || intervals.length==0) {
			return result.toArray(new int[0][]);
		}

		Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
		int start = intervals[0][0];
		int end= intervals[0][1];

		for(int[] temp : intervals) {
			if(temp[0] <= end) {
				end = Math.max(end, temp[1]);
			}else {
				result.add(new int[]{start,end});
				start = temp[0];
				end = temp[1];
			}
		}
		result.add(new int[]{start,end});
		return result.toArray(new int[0][]);*/


		//Approach -2 (Using LinkedList Concept)
		LinkedList<int[]> result = new LinkedList<>();
		if(intervals == null || intervals.length==0) {
			return result.toArray(new int[result.size()][]);
		}

		Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
		for(int[] temp : intervals) {
			if(result.isEmpty() || result.getLast()[1]<temp[0]) {
				result.add(temp);
			}
			else{
				result.getLast()[1] = Math.max(result.getLast()[1], temp[1]);
			}
		}
		return result.toArray(new int[result.size()][]);
	}

	public static void main(String[] args) {
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] mergedArray = merge(intervals);
		for (int i = 0; i < mergedArray.length; i++) {
			for (int j = 0; j < mergedArray[i].length; j++) {
				System.out.println("Values at arr[" + i + "][" + j + "] is " + mergedArray[i][j]);
			}
		}
	}
}
