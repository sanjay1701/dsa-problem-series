package Sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1859. Sorting the Sentence
 */
public class SortTheSentence {

    public static String sortSentence(String s) {
        //Approach 1 - Using Comparator
        /*String[] arr = s.split(" ");
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
        return sb.toString();*/

        //Approach - 2 (using subString to find index and replaceAll methods to replace digit in array of string)
        /*String[] arr = s.split(" ");
        String[] newSentence = new String[arr.length];
        StringBuilder sb = new StringBuilder();
        int j ;
        for(int i=0;i< arr.length;i++){
            int index = Integer.parseInt(arr[i].substring(arr[i].length()-1));
            newSentence[index-1] = arr[i].replaceAll("\\d","");
        }
        for(j=0;j< newSentence.length-1;j++){
            sb.append(newSentence[j]+ " ");
        }
        sb.append(newSentence[j]);
        return sb.toString();*/


        //Approach - 3 (using chartAt to find index and substring to insert in new array)
        String[] arr = s.split(" ");
        String[] newSentence = new String[arr.length];
        StringBuilder sb = new StringBuilder();
        int i =0 ;
        for (String word : arr) {
            i = (int) (word.charAt(word.length() - 1) - '0');
            newSentence[i - 1] = word.substring(0, word.length() - 1);
        }
        for(i=0;i< newSentence.length-1;i++){
            sb.append(newSentence[i]+ " ");
        }
        sb.append(newSentence[i]);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
}
