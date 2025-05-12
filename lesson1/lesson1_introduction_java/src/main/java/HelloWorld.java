import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Xin chao anh em!!");
//        // cú pháp : datatype variableName;
//        // number: byte, short, int, long (số nguyên)
//        // floating point: float, double
//        // boolean
//        // char: ký tự đơn
//        // String: Chuỗi
//        int age = 30;
//        long i = 1000L; // riêng long khai báo cần L ở cuối
//        System.out.println(age);
//        System.out.println(i);
//
//        float f = 2.0f;
//        System.out.println(f);
//        double d = 2.0125;
//        System.out.println(d);
//
//        final int MAX_SIZE = 25; //Khai báo hằng.

        // Scanner : datatype
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tuổi của bạn: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào tên của bạn");
        String name = sc.nextLine();
        System.out.println("Tuổi của bạn là : " + age);

    }
}
