import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter your student name");
        String input_name = scanner.next();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("Position of the students in the list " + input_name + " is not found");
        }

    }
}
