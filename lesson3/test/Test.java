//public class test {
//    public static void main(String[] args) {
//        //Cú pháp khai báo mảng: data_type[] arr;
//        int[] nums;
//        String[] names;
//        // Cú pháp khởi tạo mảng: new data_type[size];
//        nums = new int[10];
//        names = new String[10];
//        // cú pháp ngắn gọn hơn: array initializer
//        int[] numbers = {1, 2, 3};
//        // thao tác với giá trị
//        numbers[0] = 111;
//        numbers[1] = 222;
//        numbers[2] = 333;
//        System.out.println(numbers[1]); // 2
//        //Duyệt mảng
//        // Cách 1: dùng for truyền thống
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//        // Cách hiện đại và phổ biến: for each
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//    }
//
//}
public class Test {
    public static void main(String[] args) {
        sum(10,10);
        System.out.println(sum(10,10));
        System.out.println(sub(10,10));
        System.out.println(mul(10,10));
        System.out.println(div(10,10));
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(total(numbers));
    }
    // sub ,div ,mul
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
    public static int total(int[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return total;
    }
}