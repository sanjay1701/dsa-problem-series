package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInString {
	public static void main(String[] args) {

		//Approach - 1 (Best Optimized Approach)
		String str = new String("Sakkkettttt");
		String[] newStr = str.split("");
		Integer count =0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<newStr.length;i++) {
			count = map.containsKey(newStr[i]) ? map.put(newStr[i], count)+1 : 1;
			map.put(newStr[i], count);
		}
		for(Map.Entry<String, Integer> set : map.entrySet()) {
			if(set.getValue()>=2)
				System.out.println(set.getKey());
		}


		//Approach - 2 (will work if we have only 2 same characters as redundant)
		/*String str = new String("Sakkett");
		int count =0;
		char[] newStr = str.toCharArray();
		for(int i=0;i<=newStr.length;i++) {
			for(int j=i+1;j<newStr.length;j++) {
				if(newStr[i]==newStr[j]) {
					System.out.println(newStr[j]);
					count++;
				}
			}
		}*/
	}
}
