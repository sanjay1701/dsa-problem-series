package binarySearchQuestions;

/**
 *
 */
public class SmallestLetterGreaterThanTarget {

    public static char nextGreatestLetter(char[] letters,char target){
        int start = 0, end = letters.length-1;
        if(target>letters[end]){
            return letters[start];
        }
        while (start<=end){
            int mid = end - (end-start)/2;
            if(letters[mid] <= target)
                start = mid + 1;
            else
                end = mid-1;
        }
        return letters[start%letters.length];
    }

    public static void main(String[] args) {
        char ans = nextGreatestLetter(new char[]{'c', 'f', 'j'},'c');
        char ans1 = nextGreatestLetter(new char[]{'a', 'b'},'z');
        System.out.println(ans);
        System.out.println(ans1);
    }
}
