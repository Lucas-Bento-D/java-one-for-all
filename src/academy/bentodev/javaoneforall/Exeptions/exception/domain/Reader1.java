package academy.bentodev.javaoneforall.Exeptions.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Reader1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 1");
    }
}
