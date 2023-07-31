// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

package Homework.Homework2;

import java.util.Scanner;

public class Task1 {

    public static float input() {
        System.out.println("Введите дробное число: ");
        Scanner scanner = new Scanner(System.in);
        String inputs = scanner.nextLine();
        while (!isFloatNumber(inputs) | !inputs.contains(".")) {
            System.out.println("Введите дробное число: ");
            inputs = scanner.nextLine();
        }
        float number = Float.parseFloat(inputs);
        scanner.close();
        return number;
    }

    public static boolean isFloatNumber(String val) {
        // полезный метод
        try {
            Float.parseFloat(val);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + "Вы ввели некорректное значение!!!");

            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(input());
    }
}
