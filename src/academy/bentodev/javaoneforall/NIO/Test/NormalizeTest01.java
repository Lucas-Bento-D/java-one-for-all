package academy.bentodev.javaoneforall.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String dirProject = "home/lucas/dev";
        String file = "../../arquivo.txt";
        Path path1 = Paths.get(dirProject, file);
        System.out.println(path1.normalize()  );

        Path path2 = Paths.get("home/./lucas/./dev");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
