package Seminar.FirstSem;

// Задание N°4
// Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// 1. Если в какой-то ячейке встретился null, то необходимо "оповестить" об этом
// пользователя
// 2. Если пиШ'ы встретились в нескольких ячейках, то идеально было бы все их
// "подсветить"
public class zadanie4 {
    public static void main(String[] args) {
        Integer[] arr = {1,0,2,8,null,3,null,5,null};
        try {
            CheckException(arr);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public static void CheckException(Integer[] array) {
        StringBuilder sb = new StringBuilder("Null index = ");
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                sb.append(i).append(", ");
                flag = true;

            }
        }
        if (flag) throw new RuntimeException(sb.toString());
    }
}
