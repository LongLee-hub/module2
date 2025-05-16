import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {14,15,32,65,22,33};
        int[] array2 = {1,2,6,5,3,5};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < array2.length + array1.length; i++) {
            array3[i] = array2[i - array1.length];
        }
        System.out.println(Arrays.toString(array3));
    }
}
