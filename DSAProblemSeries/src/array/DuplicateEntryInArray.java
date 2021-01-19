package array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEntryInArray {
	public static void main(String[] args) {

		String name[]= {"apple","banana","mango","pineapple","apple", "mango"};
		Set<String> set = new HashSet<>();
		for(String val : name) {
			if(set.add(val)==false) {
				System.out.println("Duplicate Entry in Array: " +val);
			}
		}
	}
}
