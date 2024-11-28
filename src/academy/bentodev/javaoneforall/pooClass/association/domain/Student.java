package academy.bentodev.javaoneforall.pooClass.association.domain;

public class Student {
    private String name;
    private int age;
    private Seminary seminary;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("------------ Aluno ------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("Seminario que vai participar: " + this.seminary.getTitle());
        System.out.println("Endereço do seminario: " + this.seminary.getLocation().getAddress());

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSeminary(Seminary seminary) {
        this.seminary = seminary;
    }

    public Seminary getSeminary() {
        return seminary;
    }
}
