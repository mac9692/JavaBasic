package iostream.ex1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("data.dat");
        outputStream.write(7);
        outputStream.close();
    }

    @Override
    public String toString() {
        return "ABC";
    }
}
