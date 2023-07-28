// Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

package Seminar.FirstSem;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        int[] arr = { 1, -1, 5, 6, 17, 27 };
        int minim = 6;
        int value = 5;
        // System.out.println(array(arr, minim));
        System.out.println(array(null, value, minim));
    }

    // public static int array(int[] mas, int min) {
    // if (mas.length < min) {
    // return -1;
    // }

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