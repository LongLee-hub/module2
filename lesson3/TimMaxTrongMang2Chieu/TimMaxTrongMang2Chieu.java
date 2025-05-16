import java.util.Scanner;

public class TimMaxTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng của ma trận");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập giá trị dòng "+ i + "cột "+ j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = matrix[0][0];
        int indexofrow = 0;
        int indexofcolumn = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    indexofrow = i;
                    indexofcolumn = j;
                }
            }
        }
        System.out.println("\nMa trận bạn vừa nhập:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.printf("\nPhần tử lớn nhất trong ma trận là: " + max);
        System.out.printf("Tọa độ của phần tử lớn nhất là: dòng " + indexofrow + " cột " + indexofcolumn);

        scanner.close();
    }
}
