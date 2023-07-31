package Homework.Homework2;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        try {
            int d = 3;
            double catchedRes1 = Float.valueOf(intArray[7]) / Float.valueOf(d);
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());

        }

    }
}
