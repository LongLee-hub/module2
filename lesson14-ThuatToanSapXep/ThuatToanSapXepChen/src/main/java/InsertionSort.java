import java.util.Arrays;

public class InsertionSort {
    static int[] arr = {3 ,4 ,6 ,7 ,2 ,5 ,9};

    public static void insertionSort(int[] arr){
        int pos,x;

        for (int i = 1; i < arr.length; i++){
            pos = i;
            x = arr[i];
            while (pos > 0 && arr[pos-1] > x){
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = x;
        }

    }

    public static void main(String[] args) {
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
