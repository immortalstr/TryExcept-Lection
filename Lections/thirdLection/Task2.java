package Lections.thirdLection;

import java.io.IOException;

// Создайте метод doSomething(), который может быть источником одного из типов checked 
// exceptions (тело самого метода прописывать не обязательно). Вызовите этот метод из main и 
// обработайте в нем исключение, которое вызвал метод doSomething()

public class Task2 {

    // public static void doSomething() throws Exception {
        // throw new Exception("Error!!!");}

    public static void main(String[] args) {
        // try{
        // doSomething();
        // }catch(Exception e){e.printStackTrace();}
    //     try (Counter counter = new Counter()) {
    //         counter.add();
    //         System.out.println(counter.getCount());
    //         counter.close();
    //         System.out.println(counter.getCount());

    //     } catch (IOException e) {
    //         System.out.println(e.getMessage());
    //     }
    int i = 0;
    try{
        Integer [] array = {4,5,6,9,null,4};

        for (i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
            array[i]++;
        }
    }catch (NullPointerException e){
            try{
                throw new NullPointer(i);
            }
            catch(NullPointer ex){
                System.out.println(ex.getMessage());
            }
        }


    //     try{int a = 5;
    //     int b = 0;
    //     System.out.println(a/b);
    // }catch(ArithmeticException e){
    //    try {
    //      throw new DivisionByZero();
    //    }catch(DivisionByZero zero){
    //     System.out.println(zero.getMessage());
    //    }
    // }
    // }
    }
    }