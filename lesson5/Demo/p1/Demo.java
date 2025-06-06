import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20; // b = 10
//
//        System.out.println("Giá trị của a là " + a);
//        System.out.println("Giá trị của b là " + b);
//        // Biến kiểu tham trị
//        swap(a, b);
//        System.out.println("Giá trị của a sau khi swap là" + a);
//        System.out.println("Giá trị của b sau khi swap là " + b);
//    }
//    public static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("Giá trị của a bên trong method swap" + a);
//        System.out.println("Giá trị của b bên trong method swap" + b);
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println("Trước khi gọi method swap " + Arrays.toString(arr));

    }
}
