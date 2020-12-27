package array;

public class ReverseArray {
	public static void main(String[] args) {

		int[] arr = {1, 4, 3, 2};
		int n = arr.length;
		System.out.print("Reverse array is: ");
		for(int i=n-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}

	}
}
