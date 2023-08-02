package Lections.thirdLection;

import java.io.IOException;

// Создайте класс Счетчик, у которого есть метод add0), увеличивающий значение внутренней int 
// переменной на 1. Сделайте так, чтобы с объектом такого типа можно было работать в блоке
// try-with-resources. Подумайте, что должно происходить при закрытии этого ресурса? 
// Напишите метод для проверки, закрыт ли ресурс. При попытке вызвать add() у закрытого ресурса, 
// должен выброситься IOException
public class Counter implements AutoCloseable {

    private Integer count;

    public Counter() {
        this.count = 0;
    }

      public int getCount() throws IOException {
        checkClose();
        return this.count;
    }

    private void checkClose() throws IOException {
        if (this.count == null) {
            throw new IOException("Класс закрыт");
        }
    }

    public void add() throws IOException {
        checkClose();
        this.count++;
    }

    public void close() {
        this.count = null;
    }

}
