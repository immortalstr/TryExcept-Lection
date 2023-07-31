package Homework.Homework2;

import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 1;
            System.out.println(a / b);
            printSum(null, null);
            int[] abc = {};
            abc[3] = 9;
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundExceptio");
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}