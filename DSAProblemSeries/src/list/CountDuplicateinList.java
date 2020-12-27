package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountDuplicateinList {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");

		Set<String> set = new HashSet<>(list);
		for(String val : set) {
			System.out.println("Count of " + val +" in list :" +Collections.frequency(list, val));
		}


	}
}
