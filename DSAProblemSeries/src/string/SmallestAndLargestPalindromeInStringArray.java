package string;

public class SmallestAndLargestPalindromeInStringArray {

	/** Checks largest string in array and if largest then call isPalindrome() to check palindrome or not
	 * @param arr
	 */
	public static void getSmallestAndLargestStringPalindrome(String[] arr) {
		String largest = arr[0], smallest=arr[0];
		boolean palindrome = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>largest.length() && isPalindrome(arr[i])) {
				largest=arr[i];
				palindrome=true;
			}
			else if(arr[i].length()<smallest.length() && isPalindrome(arr[i])) {
				smallest=arr[i];
				palindrome = true;
			}
		}
		if(palindrome) {
			System.out.println("Smallest and Largest palindrome in string array: " +smallest+ " & " +largest);
		}else {
			System.out.println("No palindrome exists in array: -1");
		}
	}

	/**
	 * @param val - array value if largest/smallest in array
	 * @return true if string is plaindrome
	 */
	public static boolean isPalindrome(String val) {
		String temp=val;
		String reverse = "";
		for ( int i = val.length() - 1; i >= 0; i-- )
			reverse = reverse + val.charAt(i);
		if(temp.equals(reverse)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		String[] arr = {"abc", "adda", "a", "abddab", "abbbba"};
		getSmallestAndLargestStringPalindrome(arr);

	}
}
