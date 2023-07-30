package Seminar.SecondSem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * zadanie1
 */
public class zadanie1 {
    public static List<String[]> readfile(File file) {
        List<String[]> lst = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            String line;
            while ((line = bf.readLine()) != null) {
                lst.add(line.split("="));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + file.getName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lst;

    }

    public static List<String[]> replaceChar(List<String[]> lst) {
        for (String[] item : lst) {
            if (!item[1].contains("?") && !isNumber(item[1])) {
                throw new RuntimeException("Incorrect Values");
            }
            if (item[1].contains("?")) {
                item[1] = String.valueOf(item[0].length());
            }
        }

        return lst;
    }

    public static boolean isNumber(String val) {
        // полезный метод
        try {
            Integer.parseInt(val);
            return true;
        } catch (NumberFormatException e) {

            return false;
        }
    }

    public static void writeFile(List<String[]> lst, File file) {
        try {
            FileWriter fr = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fr);
            for (String[] item : lst) {
                br.write(item[0] + "=" + item[1]);
                br.newLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + file.getName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        File file = new File("Seminar/SecondSem/names.txt");
        List<String[]> lst = readfile(file);
        replaceChar(lst);
        writeFile(lst, file);

        
    }
}