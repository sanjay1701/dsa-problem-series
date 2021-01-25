package array;

public class CheckArrayPalindromeOrNot {

	/**checks whether the array is palindrome or not
	 * @param arr input array
	 */
	public static void checkArrayPalindrome(int[] arr) {
		int length = arr.length;
		int i=0;
		boolean isPalindrome = false;
		while(i<length/2) {
			if(arr[i] == arr[length-1-i]) {
				isPalindrome = true;
			}
			else {
				break;
			}
			i++;
		}
		if(isPalindrome) {
			System.out.println("Array is a palindrome");
		}else {
			System.out.println("Array is not a palindrome");
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {3, 6, 0, 6, 3};
		int[] arr2 = {3, 6, 0, 6, 3, 8};
		checkArrayPalindrome(arr1);
		checkArrayPalindrome(arr2);
	}
}
