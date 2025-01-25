package academy.bentodev.javaoneforall.IO.Test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
//            boolean isDeleted = file.delete();
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());
            System.out.println(file.canWrite());
            System.out.println(file.canRead());
            System.out.println(Instant.ofEpochSecond(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalTime() );

            boolean exists = file.exists();
            if(exists) file.delete();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
