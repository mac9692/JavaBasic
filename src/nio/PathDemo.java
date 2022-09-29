package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path path0 = Paths.get("/javastudy/simple.java");
        Path path1 = path0.getRoot();
        Path path2 = path0.getParent();
        Path path3 = path0.getFileName();

        System.out.println(path0);
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path3);
    }
}
