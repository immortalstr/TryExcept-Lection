package Lections.thirdLection;

public class NullPointer extends NullPointerException{

    public NullPointer(int index){
        super("Обращение к пустому элементу в массиве = " + index);
    }

    public NullPointer(){
        super("Обращение к пустому элементу в массиве = ");
    }
}