package Seminar.FirstSem;

public class zadanie5 {
    public static void main(String[] args) {
        int[] arrA = {1,2,5,4,8};
        int[] arrB = {3,5,3,4,1};
        try {
            printArray(newArray(arrA, arrB));
        } catch (RuntimeException e) {
           System.out.println(e.getMessage());
        }
    }
public static void printArray(int[] array){
    System.out.print("[");
for (int index = 0; index < array.length; index++) {
    System.out.print(array[index] + ", ");   
}
System.out.print("]");
}


public static int[] newArray(int[]arryaA,int[]arrayB){
    if(arryaA.length != arrayB.length){
        throw new RuntimeException("Длины массивов не равна: длина 1-го массива: " + arryaA.length + " , " + "длина 2-го массива: " + arrayB.length);
    }
    int[] arrayC = new int[arryaA.length];
    for (int i = 0; i < arrayC.length; i++) {
         arrayC[i] = arryaA[i] + arrayB[i];
    }
    return arrayC;
}

}
