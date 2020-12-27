package string;

public class MakingAnagrams {

	/** This code returns the max number of deletions required to make 2 strings anagram.
	 * @param a - first string
	 * @param b - second string
	 * @return int
	 */
	static int makeAnagram(String a, String b) {
		int[] count1 = new int[26];
		int[] count2 = new int[26];

		//store the frequiencies of characters in string1 in count1
		for (int i=0; i<a.length(); i++)
		{
			count1[a.charAt(i)-'a']++;
		}
		//store the frequiencies of characters in string2 in count2
		for (int i=0; i<b.length(); i++)
		{
			count2[b.charAt(i)-'a']++;
		}
		//result is the number of characters to be removed
		int result = 0;
		for (int i=0; i<26; i++)
		{
			result = result + Math.abs(count1[i] - count2[i]);
		}
		return result;

	}

	public static void main(String[] args) {

		String a = "cde";
		String b = "abc";
		int res = makeAnagram(a, b);
		System.out.println("Max deletions required to make 2 strings anagram: " +res);
	}
}
