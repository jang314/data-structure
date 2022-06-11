package chapter1;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int target = 0;

        int result = Bsearch(arr, target);
        System.out.println(result);
        if(result < 0) {
            System.out.println("탐색 실패");
        }else{
            System.out.println("타겟 저장 인덱스 : " + result);
        }
    }

    private static int Bsearch(int[] arr, int target) {
        int startIdx = 0;
        int endIdx = arr.length - 1;
        int result = -1;
        while(startIdx <= endIdx) {
            if(arr[(startIdx + endIdx) / 2] == target) {
                result = (startIdx + endIdx) / 2;
                break;
            } else {
                if(arr[(startIdx + endIdx) / 2] < target) {
                    // mid에 저장된 인덱스 값의 배열요소도 새로운 탐색의 범위에 포함이 되어 불필요한 작업을 함.
                    startIdx = (startIdx + endIdx) / 2 + 1;
                } else {
                    endIdx = (startIdx + endIdx) / 2 - 1;
                }
                if(startIdx > endIdx) break;
            }
        }
        return result;
    }
}
