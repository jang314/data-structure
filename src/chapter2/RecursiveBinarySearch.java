package chapter2;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int target = 3;
        int idx = bSearchRecur(arr, 0, arr.length -1, target);
        if(idx == -1) {
            System.out.println("탐생식패");
        } else {
            System.out.println("인덱스 "+ idx);
        }

    }

    static int bSearchRecur(int[] arr, int start, int end, int target) {
        int result = -1;
        int mid = (start + end) / 2;

        if(start > end) {
            result = mid;
        } else if(arr[mid] == target) {
            result = mid;
        } else if(arr[mid] < target) {
            result = bSearchRecur(arr, mid + 1, end ,target);
        } else if(arr[mid] > target) {
            result = bSearchRecur(arr, start, end-1, target);
        }

        return result;

    }
}
