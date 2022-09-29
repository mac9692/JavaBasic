package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentDir {
    public static void main(String[] args) {
        Path currentPath = Paths.get("");
        String cdir;


        if (currentPath.isAbsolute()) {
            cdir = currentPath.toString();
        } else {
            cdir = currentPath.toAbsolutePath().toString();
        }

        System.out.println(cdir);
    }
}
