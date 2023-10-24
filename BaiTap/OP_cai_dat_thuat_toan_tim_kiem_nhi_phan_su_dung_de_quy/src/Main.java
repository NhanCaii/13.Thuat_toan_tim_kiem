import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr={1,2,3,5,7,8,10};
        int a=binarySearch(arr,0,arr.length-1,8);
        System.out.println(a);
    }

    static int binarySearch(int arr[], int low, int high, int value) {
        if (high>=low) {

            int mid = low + (high - low)/2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, low, mid-1, value);
            return binarySearch(arr, mid+1, high, value);
        }
        return -1;
    }
}