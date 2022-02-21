package atguigu.file;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
    @Test
    public void test(){
        String filePath = "d:\\hahaha.png";
        String descPath = "d:\\hahaha1.png";
        int readData = 0;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] buf = new byte[1024];
        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(descPath);
            while ((readData=fileInputStream.read(buf))!=-1){
               fileOutputStream.write(buf,0,readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
