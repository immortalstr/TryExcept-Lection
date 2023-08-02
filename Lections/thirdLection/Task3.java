package Lections.thirdLection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws FileNotFound{
        String path = "asd.txt";

        try(FileReader fr = new FileReader(path)){
            int i = 0;

        }catch(IOException e){
            throw new FileNotFound(path);
        }

        }
    }
