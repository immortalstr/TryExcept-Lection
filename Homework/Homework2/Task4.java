package Homework.Homework2;

import java.util.Scanner;

import org.w3c.dom.ranges.RangeException;

/**
 * Task4
 */
public class Task4 {

    public static void inputPerson() {
        System.out.println("Ввведите текст: ");
        Scanner scanner = new Scanner(System.in);
        String inputs = scanner.nextLine();
        if (inputs.isEmpty()) {
            throw new IllegalArgumentException("Пустые строки вводить нельзя.");
        }

        System.out.println("Ваш текст: [" + inputs + "]");
        scanner.close();
    }

    public static void main(String[] args) {
        // try {
        inputPerson();
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
    }

}
