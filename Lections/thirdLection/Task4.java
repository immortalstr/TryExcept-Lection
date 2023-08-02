package Lections.thirdLection;

import java.util.ArrayList;

public class Task4 {

    public static void main(String[] args) throws MyArraySize , MyArrayDataException{
        String[][] Arr ={{"3","5","8","7"},{"1","5","8","7"},{"4","5","8","7"},{"4","5","8","7"},{"3","5","8","7"}};
        try{
            System.out.println(Array(Arr));
        }catch(MyArraySize a){
            System.out.println(a.getMessage());
        }catch(MyArrayDataException x){
            System.out.println(x.getMessage());
        }
        
    }

    public static int Array(String [][] array) throws MyArraySize{
            int sum = 0;
            if (array.length != 4 ||  array[0].length != 4){
                throw new MyArraySize(array.length,array[0].length);
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++){
                    try{
                         sum = sum + Integer.parseInt(array[i][j]);
                    }catch(NumberFormatException e){
                        throw new MyArrayDataException(i,j);
                    }
                }
            }
            return sum;
        }
    }
    