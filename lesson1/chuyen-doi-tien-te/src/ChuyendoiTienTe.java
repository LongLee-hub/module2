import java.util.Scanner;

public class ChuyendoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyVN,moneyDolar;
        System.out.println("Tien Viet");
        moneyVN = scanner.nextDouble();
        moneyDolar = moneyVN*24500;
        System.out.println(moneyVN + " VND = " + moneyDolar + " Dolar");

    }
}
