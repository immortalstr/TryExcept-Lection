package Lections.thirdLection;

import java.io.IOException;

// Создайте метод doSomething(), который может быть источником одного из типов checked 
// exceptions (тело самого метода прописывать не обязательно). Вызовите этот метод из main и 
// обработайте в нем исключение, которое вызвал метод doSomething()

public class Task2 {

    public static void doSomething() throws Exception {
        // throw new Exception("Error!!!");

    }

    public static void main(String[] args) {
        // try{
        // doSomething();
        // }catch(Exception e){e.printStackTrace();}
        try (Counter counter = new Counter()) {
            counter.add();
            System.out.println(counter.getCount());
            counter.close();
            System.out.println(counter.getCount());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
