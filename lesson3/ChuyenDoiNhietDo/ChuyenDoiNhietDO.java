import java.util.Scanner;

public class ChuyenDoiNhietDO {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        double doC;
        double doF;
        int choice;

        do{
            System.out.println("Menu");
            System.out.println("1. Chuyển độ C sang độ F");
            System.out.println("2. Chuyển độ F sang độ C");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Nhập độ C");
                    doC = scanner.nextDouble();
                    System.out.println("Độ F là: " + doCsangdoF(doC));
                    break;
                case 2:
                    System.out.println("Nhập độ F");
                    doF = scanner.nextDouble();
                    doFsangdoC(doF);
                    System.out.println("Độ C là: " + doFsangdoC(doF));
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 0);
        scanner.close();

    }

    private static double doFsangdoC(double doF) {
        double doC;
        doC = (doF - 32) * 5.0 / 9.0;
        return doC;
    }

    private static double doCsangdoF(double doC) {
        double doF;
        doF = (9.0 / 5.0) * doC + 32;
        return doF;
    }
}

