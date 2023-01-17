package binarySearchQuestions;

public class FloorOfANumber {
    /**
     * https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1  [Note-Remove arr from return statement for geeks of geekscode]
     * https://www.codingninjas.com/codestudio/problems/find-floor-value_920447?leftPanelTab=0
     * The floor functions give us the nearest integer down. (Floor Function: the greatest integer that is less than or equal to x)
     * The Floor of 2.31 is 2
     */
    static int findFloor(int arr[], int N, long X)
    {
        if(X<arr[0] || arr[arr.length-1]<X){
            return -1;
        }
        int start = 0, end = N-1;
        while (start<=end){
            int mid = end - (end-start)/2;
            if(arr[mid]<X)
                start = mid + 1;
            else if(arr[mid]>X)
                end = mid-1;
            else
                return arr[mid];
        }
        return arr[start-1];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 7, 12, 14};
        int arr2[] = {10, 20, 30, 40, 50};
        int[] arr1 ={4, 8, 9, 11};
        int[] ar = {35 ,36 ,37 ,38 ,39 ,40 ,41 ,42 ,43 ,44 ,45 ,46 ,47 ,48 ,49 ,50 ,51 ,52 ,53 ,54 ,55 ,56 ,57 ,58 ,59 ,60 ,61 ,62 ,63 ,64 ,65 ,66 ,67 ,68 ,69 ,70 ,71, 72 ,73 ,74 ,75 ,76 ,77 ,78 ,79 ,80 ,81 ,82 ,83 ,84 ,85 ,86 ,87 ,88 ,89 ,90 ,91 ,92 ,93 ,94 ,95 ,96 ,97 ,98 ,99 ,100 ,101 ,102 ,103 ,104 ,105 ,106 ,107 ,108 ,109 ,110 ,111 ,112, 113};
        System.out.println(findFloor(arr,arr.length-1,10));
        System.out.println(findFloor(arr2,arr2.length-1,50));
        System.out.println(findFloor(arr1,arr1.length-1,3));
        System.out.println(findFloor(ar,79,159));
    }
}
