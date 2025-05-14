import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng trong dãy");
        int soLuong = input.nextInt();
        int[] array ;
        array = new int[soLuong];
        int i = 0;
        while ( i < soLuong){
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Array :");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
        int min =  array[0];
        int index = 0;
        for (int j = 1; j < array.length; j++){
            if (array[j] < min){
                min = array[j];
                index = j;
            }
        }
        System.out.println("Minimum element is " + array[index]);

    }
}
