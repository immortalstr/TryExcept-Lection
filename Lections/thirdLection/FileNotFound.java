package Lections.thirdLection;

import java.io.File;
import java.io.FileNotFoundException;

public class FileNotFound extends FileNotFoundException {

    public FileNotFound(String path){
        super(path + "--> Файл не найден!!!");
    }
    
    public FileNotFound(){
        super( "Файл не найден!!!");
    }
}
