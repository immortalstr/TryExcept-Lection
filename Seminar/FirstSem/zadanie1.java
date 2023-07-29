// Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

package Seminar.FirstSem;

/**
 * main
 */
public class zadanie1 {

    public static void main(String[] args) {
        int[] arr = { 1, -1, 5, 6, 17, 27 };
        int minim = 6;
        int value = 2;
        // System.out.println(array(arr, minim));
        System.out.println(message(array(arr, value, minim)));
    }

    // public static int array(int[] mas, int min) {
    // if (mas.length < min) {
    // return -1;
    // }
    public static String message(int exception) {
        String m = switch (exception) {
            case -1 -> "Длина массива меньше заданного минимума!";
            case -2 -> "Искомый элемент не найден!";
            case -3 -> "Вмсесто массива пришел null!";
            default -> "Индекс эллемента = " + exception;
        };
        return m;
    }

    public static int array(int[] mas, int value, int min) {
        if (mas == null)
            return -3;
        if (mas.length < min) {

            return -1;
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == value) {
                return i;
            }
        }
        return -2;
    }

}