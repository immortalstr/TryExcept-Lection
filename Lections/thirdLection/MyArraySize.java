package Lections.thirdLection;

import java.io.IOException;

public class MyArraySize extends ArrayIndexOutOfBoundsException{
    public MyArraySize(int rowSize,int columSize){
        super("Колличество строк и столбцов массива не равно 4!!!" + rowSize + "x" + columSize);
    }
}
