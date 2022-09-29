package iostream.ex1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("data.dat");
        int data = inputStream.read();
        inputStream.close();

        System.out.println(data);
    }
}
