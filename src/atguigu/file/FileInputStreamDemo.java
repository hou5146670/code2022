package atguigu.file;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {


        }
        @Test
    public void readFile01(){
            String filePath = "D:\\news1.txt";
            int readData = 0;
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(filePath);
                while ((readData=fileInputStream.read())!=-1){
                    System.out.print((char)readData);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

}
