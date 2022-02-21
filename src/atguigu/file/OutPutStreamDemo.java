package atguigu.file;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStreamDemo {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        String filePath = "d:\\news1.txt";
        FileOutputStream fileOutputStream = null;
        try {
        fileOutputStream = new FileOutputStream(filePath);
        fileOutputStream.write('H');
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
