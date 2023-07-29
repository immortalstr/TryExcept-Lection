// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

package Seminar.FirstSem;

public class zadanie3 {
    public static void main(String[] args) {

        int[][] massive = {{1,0,1,0,1},{0,1,0,1,1},{1,0,1,2,0},{1,0,1,0,0},{1,0,1,0,0}};

        System.out.println(sumArray(massive));

    }

    public static int sumArray(int[][] mass) {
        if (mass.length != mass[0].length) {
            throw new RuntimeException("Массив не квадратный " + mass.length + " " + mass[0].length);
        }
        int sum = 0;
        for (int i =0; i < mass.length; i++){
            for (int j = 0; j < mass[0].length; j++){
                if (mass[i][j] != 0 && mass[i][j]!= 1){
                    throw new RuntimeException("Некорректное значение: " + mass[i][j]);
                }
                sum += mass[i][j];

            }
        }
        return sum;
    }
}
