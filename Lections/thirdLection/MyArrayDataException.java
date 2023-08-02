package Lections.thirdLection;

public class MyArrayDataException extends NumberFormatException{

    public MyArrayDataException(int indexRow,int indexColum){
        super("Нельзя преобразовать данные в число!!! : " + indexRow + " " + indexColum);
    }
}
