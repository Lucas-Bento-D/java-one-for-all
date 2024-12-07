package academy.bentodev.javaoneforall.pooClass.interfaces.test;

import academy.bentodev.javaoneforall.pooClass.interfaces.domain.DatabaseLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader dbBaseLoader = new DatabaseLoader();
        dbBaseLoader.load();
    }
}
