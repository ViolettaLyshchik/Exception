// Разработайте программу, которая выбросит Exception, 
// когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, 
// что пустые строки вводить нельзя.
package Exception_HW2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(inputString(scanner));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String inputString(Scanner scanner) throws Exception {
        String result;
        result = scanner.nextLine();
        if (result.equals("")) {
            throw new Exception("Нельзя вводить пустые строки");
        }
        return result;
    }
}