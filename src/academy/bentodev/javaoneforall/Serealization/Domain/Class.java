package academy.bentodev.javaoneforall.Serealization.Domain;

public class Class {
    String name;

    public Class(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
