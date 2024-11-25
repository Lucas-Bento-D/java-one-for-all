package academy.bentodev.javaoneforall.pooClass.methods.domain;

public class PrintStudent {
    public void printStudent(Student student){
        System.out.println("--------------");
        student.name = "goku";
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
