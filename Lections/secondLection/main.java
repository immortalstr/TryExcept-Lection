package Lections.secondLection;

public class main {

public static void main(String[] args) {
    
    try {
        throw new RuntimeException("Hello");
    } catch (IndexOutOfBoundsException e){ System.out.println("Hello!");
    }finally{

        System.out.println("God day!");
    }

}



}