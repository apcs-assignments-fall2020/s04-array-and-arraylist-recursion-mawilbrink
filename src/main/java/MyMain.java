import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if(list.size() == i+1){
            return true;
        }
        else{
            if(list.get(i) > list.get(i+1)){
                return false;
            }
            i ++;
            return isSortedRec(list, i);
            //compare last two
            //remove last one
            //if they are not decreasing 
        }
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        int size = arr.length;
        if(size == i){
            if (count == 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(arr[i] == x){
                count --;
            }
            i++;
            return hasCountCopiesRec(arr, x, count, i);
        }
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        // YOUR CODE HERE
        return binarySearchRec(arr, num, 0, arr.length);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        if(upperBound - lowerBound <= 1){
            return false;
        }
        else{
            int testBound = (upperBound+lowerBound)/2;
            if(arr[testBound] > num){
                upperBound = testBound;
                return binarySearchRec(arr, num, lowerBound, upperBound);
            }
            else if(arr[testBound] < num){
                lowerBound = testBound;
                return binarySearchRec(arr, num, lowerBound, upperBound);
            }
            else{
                return true;
            }

        }
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
