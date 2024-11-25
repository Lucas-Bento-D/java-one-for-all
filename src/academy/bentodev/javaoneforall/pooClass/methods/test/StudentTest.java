package academy.bentodev.javaoneforall.pooClass.methods.test;

import academy.bentodev.javaoneforall.pooClass.methods.domain.PrintStudent;
import academy.bentodev.javaoneforall.pooClass.methods.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Luffy";
        student1.age = 17;
        student1.sex = 'M';

        student2.name = "Sakura";
        student2.age = 16;
        student2.sex = 'F';

//        Quando se passa parametros de tipos primitivos, voce sempre ta passando uma cópia desse tipo
//        Entretanto, se passar parametros de tipo de referencia, você está passando de fato o endereço eletronico desse tipo
//        Ou seja, se você alterar qualquer dado de um tipo de referencia em qualquer metodo, você também altera o original, diferende do tipo primitivo
        PrintStudent printStudent = new PrintStudent();
        printStudent.printStudent(student1);
        printStudent.printStudent(student2);
        System.out.println(student1.name);
        System.out.println(student2.name);

        System.out.println("###########");
        student1.print();
    }
}
