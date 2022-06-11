package chapter1;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {3,5,2,4,9};
        int result = lSearch(arr, 4);
        if(result < 0) {
            System.out.print("탐색 실패");
        }else {
            System.out.println("타겟 저장 인덱스 : " + result);
        }
    }

    private static int lSearch(int[] arr, int target) {
        int idx = -1;
        for(int i =0 ; i < arr.length -1; i++) {
            if(arr[i]==target) {
                if(idx < 0) {
                    idx = i;
                }
            }
        }
        return idx;
    }
}
