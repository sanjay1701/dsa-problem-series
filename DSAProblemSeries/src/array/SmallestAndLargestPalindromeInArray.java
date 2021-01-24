package array;

public class SmallestAndLargestPalindromeInArray {

	/** Checks largest value in array and if largest then call isPalindrome() to check palindrome or not
	 * @param arr
	 */
	public static void getSmallestAndLargestPalindrome(int[] arr) {
		int largest= arr[0], smallest= arr[0];
		boolean palindrome = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest && isPalindrome(arr[i])) {
				largest=arr[i];
				palindrome = true;
			}
			else if(arr[i]<smallest && isPalindrome(arr[i])) {
				smallest=arr[i];
				palindrome = true;
			}
		}
		if(palindrome) {
			System.out.println("Smallest and Largest palindrome in array: " +smallest +" & " +largest+ " respectively" );
		}else {
			System.out.println("No palindrome exists in array: -1");
		}
	}

	/**
	 * @param n - array value if largest in array
	 * @return true if number is plaindrome
	 */
	public static boolean isPalindrome(int n) {
		int rem, rev=0;
		int temp=n;
		while(n>0) {
			rem = n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		if(temp==rev) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		int[] arr = {232, 5, 1, 99999, 54545, 999991};
		getSmallestAndLargestPalindrome(arr);
	}
}
