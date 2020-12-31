package array;

public class SortArrayof3elements {

	public static void sort(int[] arr, int n) {
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
				j++;
			}
			int k=j;
			for(int m=j;m<n;m++) {
				if(arr[m]==1) {
					int temp = arr[m];
					arr[m] = arr[k];
					arr[k] = temp;
					k++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {

		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sort(arr,arr.length);
	}
}
