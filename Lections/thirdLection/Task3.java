package Lections.thirdLection;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args){
        String path = "asd.txt";

        try{

            FileReader fr = new FileReader(path);

        }catch(FileNotFoundException e){
            throw new FileNotFound(path);
        }

        }
    }
