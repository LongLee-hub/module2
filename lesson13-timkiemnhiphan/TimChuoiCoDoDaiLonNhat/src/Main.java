import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max =  new LinkedList<>();

        System.out.println("Nhập chuỗi");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));

            if ( list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character c : max) {
            System.out.println(c);
        }
    }
    /*********************************************************************************
     * Tính toán độ phức tạp của bài toán này:                                        *
     * 	1 vòng lặp * 3 câu lệnh = 3;                                                  *
     * 	1 vòng lặp * 1 câu lệnh = 1;                                                  *
     *                                                                                *
     * 	T(n) = O(n)                                                                   *
     *  Độ phức tạp của bài toán là O(n)                                           	  *
     *********************************************************************************/
}

