package iostream.ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("data.dat");
            int data = inputStream.read();
            System.out.println(data);
        }
        finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }

        Write7ToFile write7ToFile = new Write7ToFile();
        System.out.println(write7ToFile);
    }
}
