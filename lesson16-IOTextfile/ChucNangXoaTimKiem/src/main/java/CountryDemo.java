import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryDemo {
    private static List<Country> countries = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("countries.csv");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while (true) {
            try {
                if (!((line = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String[] token = line.split(",");
            int id = Integer.parseInt(token[0]);
            String code = token[1];
            String name = token[2];
            Country country = new Country(id, code, name);
            countries.add(country);

        }

        System.out.println("=====Ứng dụng quản lý======");
        System.out.println("1. Danh sách quốc gia");
        System.out.println("2. Thêm quốc gia");
        System.out.println("3. Sửa quốc gia");
        System.out.println("4. Xóa quốc gia");
        System.out.println("5. Tìm kiếm quốc gia");
        System.out.println("0. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Xin mời nhập lựa chọn");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng ứng dụng");
                    return;
                case 1:
                    displayCountries();
                    break;
                case 2:
                    addCountry();
                    break;
                case 3:
                    editCountry();
                    break;
                case 4:
                    deleteCountry();
                    break;
                case 5:
                    findCountry();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }

    private static void findCountry() {
        System.out.println("Tìm kiếm quốc gia");
        System.out.println("Vui lòng ID, Mã hoặc tên quốc gia");
        String searchTerm = scanner.nextLine().trim();
        System.out.println("Kích thước danh sách countries: " + countries.size());
        List<Country> foundCountries = new ArrayList<>();
        for (Country country : countries) {
            // So sánh với MỘT từ khóa tìm kiếm duy nhất được đọc từ người dùng
            // Sử dụng .toLowerCase() để tìm kiếm không phân biệt chữ hoa chữ thường trên mã và tên
            if (String.valueOf(country.getId()).contains(searchTerm) ||
                    country.getCode().toLowerCase().contains(searchTerm.toLowerCase()) ||
                    country.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                foundCountries.add(country);
            }
        }
        if (foundCountries.isEmpty()) {
            System.out.println("Không tìm thấy");
        }else{
            System.out.println("===== Kết quả tìm kiếm =====");
            System.out.printf("%-5s %-10s %-20s\n", "ID", "Mã", "Tên");
            System.out.println("-------------------------------------");
            for (Country country : foundCountries) {
                System.out.printf("%-5d %-10s %-20s\n", country.getId(), country.getCode(), country.getName());
            }
            System.out.println("-------------------------------------");
        }

    }

    private static void deleteCountry() {
        System.out.println("Xóa country");
        System.out.println("Nhập id country cần xóa");
        int idtoDelete;
        try{
            idtoDelete = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Số không hợp lệ");
            return;
        }
        Country countryToDelete = null;
        for (Country country : countries) {
            if (country.getId() == idtoDelete) {
                countryToDelete = country;
                break;
            }
        }
        if (countryToDelete != null) {
            countries.remove(countryToDelete);
            System.out.println("Đã xóa quốc gia có id là " + idtoDelete);
        }else{
            System.out.println("Không tìm thấy quốc gia có id là " + idtoDelete);
        }
    }

    private static void editCountry() {
        System.out.println(" Nhập ID quốc gia cần sửa");
        int idtoEdit;
        try{
            idtoEdit = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Id không hợp lệ");
            return;
        }
        Country countryToEdit = null;
        for (Country country : countries) {
            if (country.getId() == idtoEdit) {
                countryToEdit = country;
                break;
            }
        }
        if (countryToEdit == null) {
            System.out.println("Không tìm thấy quốc gia có id "  + idtoEdit);
            return;
        }
        System.out.println(countryToEdit);

        // Nhập thông tin mới

        System.out.println("Nhập mã mới");
        String newCode = scanner.nextLine().trim();
        if (!newCode.isEmpty()) {
            countryToEdit.setCode(newCode);
        }
        System.out.println("Nhập tên mới");
        String newName = scanner.nextLine().trim();
        if (!newName.isEmpty()) {
            countryToEdit.setName(newName);
        }
        System.out.println("Quốc gia có id " + idtoEdit + "đã cập nhật thành công");
    }

    private static void addCountry() {
        System.out.println(" Mời nhập id quốc gia");
        int id = scanner.nextInt();
        System.out.println(" Mời nhập mã quốc gia");
        String code = scanner.next();
        System.out.println(" Mời nhập tên quốc gia");
        String name = scanner.next();
        Country country = new Country(id, code, name);
        countries.add(country);
        System.out.println("Quốc gia đã được thêm mời");

    }

    private static void displayCountries() {
        System.out.println(" Danh sách quốc gia");
        System.out.printf("%-5s %-10s %-20s\n", "ID", "Code", "Name");
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
