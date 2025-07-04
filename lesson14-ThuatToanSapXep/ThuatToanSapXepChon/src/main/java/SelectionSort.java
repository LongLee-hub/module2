import java.util.Arrays;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list){
        int min;
        for (int i = 0; i < list.length -1 ; i++){
            min = i;
            for (int j = i + 1; j < list.length; j++){
                if (list[j] < list[min]){
                    min = j; // j là vị trí phần tử nhỏ nhất
                }
                // Hoán đổi vị trí phần tử nhỏ nhất lên vị trí i
                double temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
