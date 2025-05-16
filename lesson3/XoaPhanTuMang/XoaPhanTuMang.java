import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int[] array = {10,4,6,7,8,6};
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want to delete:");
        int number = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        if ( index == -1 ){
            System.out.println("Not found");
        }
        int[] newArray = new int[array.length];
        int newindex = 0;
        for (int i = 0; i < array.length; i++) {
            if ( i != index) {
                newArray[newindex++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
