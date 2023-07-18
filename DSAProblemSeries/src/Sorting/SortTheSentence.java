package Sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1859. Sorting the Sentence
 */
public class SortTheSentence {

    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        Comparator<String> stringComparator = (o1, o2) -> {
            Integer num1 = Integer.parseInt(o1.substring(o1.length()-1));
            Integer num2 = Integer.parseInt(o2.substring(o2.length()-1));
            return num1. compareTo(num2);
        };
        Arrays.sort(arr, stringComparator);
        StringBuilder sb = new StringBuilder();
        String str;
        int i;
        for(i=0;i< arr.length-1;i++){
            str = arr[i].replaceAll("\\d","");
            sb.append(str+ ' ');
        }
        str = arr[i].replaceAll("\\d","");
        sb.append(str);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
}
