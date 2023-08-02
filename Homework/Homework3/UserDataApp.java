package Homework.Homework3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataApp {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите данные (Фамилия Имя Отчество ДатаРождения НомерТелефона Пол): ");
            String input = scanner.nextLine();
            String[] userData = input.split(" ");

            if (userData.length != 6) {
                System.out.println("Ошибка: неверное количество данных.");
                return;
            }

            String surname = userData[0];
            String name = userData[1];
            String patronymic = userData[2];
            String dateOfBirth = userData[3];
            long phoneNumber = Long.parseLong(userData[4]);
            char gender = userData[5].charAt(0);

            if (!isValidDateOfBirth(dateOfBirth)) {
                throw new IllegalArgumentException("Ошибка: неверный формат даты рождения. Используйте формат dd.mm.yyyy");
            }

            if (gender != 'f' && gender != 'm') {
                throw new IllegalArgumentException("Ошибка: неверный символ пола. Используйте 'f' или 'm'.");
            }

            String filename = surname + ".txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                String formattedData = String.format("%s %s %s %s %d %c", surname, name, patronymic, dateOfBirth, phoneNumber, gender);
                writer.write(formattedData);
                writer.newLine();
                System.out.println("Данные успешно записаны в файл.");
            } catch (IOException e) {
                System.err.println("Ошибка записи в файл:");
                e.printStackTrace();
            }

        } catch (NumberFormatException e) {
            System.err.println("Ошибка: неверный формат номера телефона. Используйте целое беззнаковое число.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private static boolean isValidDateOfBirth(String dateOfBirth) {
        String regex = "\\d{2}.\\d{2}.\\d{4}";
        return dateOfBirth.matches(regex);
    }
}
