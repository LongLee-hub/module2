import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0};
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập số cần chèn");
        int n = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = scanner.nextInt();
        int[] newArray = null;
        if (index < 0 || index >= array.length - 1) {
            System.out.println("Không tìm thấy vị trí");
        } else {
            newArray = new int[array.length + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = n;
            for (int i = index + 1; i < array.length + 1; i++) {
                newArray[i] = array[i - 1];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
