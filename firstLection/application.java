package firstLection;

import java.io.File;

/**
 * application
 */
public class application {

    public static void main(String[] args) {
        // System.out.println(GetFileSize(new File("123")));
        System.out.println(divide(-10, 10));

    }

    public static int divide(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return a / b;
    }

    public static long GetFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}