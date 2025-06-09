import java.util.Arrays;
import java.util.Scanner;

public class KhoiTaoArray {
    public static void main(String[] args) {
        Scanner Array = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử bạn muốn trong mảng:");
        int arraySize = Array.nextInt();
        int[] numbers = new int[arraySize];
        System.out.println("Nhập các số trong mảng");
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Phẩn tử thứ " + i);
            numbers[i] = Array.nextInt();
        }
        System.out.println("Mảng của bạn là: " + Arrays.toString(numbers));

        System.out.println(" Số bạn cần tìm vị trí là:");
        int key = Array.nextInt();
        int result = binarySearch(numbers, key);
        if (result == -1) {
            System.out.println(" Không tìm thây vị trí nào");
        }else{
            System.out.println("Tìm thấy giá trị " + key + " tại vị trí" + result);
        }

    }
    public static int binarySearch (int[] array , int value) {
        int low = 0;
        int high = array.length -1;

        while  (low <= high) {
            int mid = low + (high - low)/2;
            if(array[mid] == value) {
                return mid;
            }
            if(array[mid] > value) {
                high = mid - 1;
            }
            else if(array[mid] < value) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
