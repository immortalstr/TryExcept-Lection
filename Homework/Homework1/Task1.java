package Homework.Homework1;
class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");

    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        throw new ArithmeticException("Деление на ноль");
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        throw new NumberFormatException("Ошибка преобразования строки в число");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}