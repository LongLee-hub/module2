import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        int size;
        int [] array;
        do {
            System.out.println("Kich thuoc cua mang");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Kich thuoc quá lớn");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while ( i < array.length){
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Danh sách array : ");
        for (i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
