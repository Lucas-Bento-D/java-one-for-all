package academy.bentodev.javaoneforall.pooClass.association.test;

import academy.bentodev.javaoneforall.pooClass.association.domain.Location;
import academy.bentodev.javaoneforall.pooClass.association.domain.Seminary;
import academy.bentodev.javaoneforall.pooClass.association.domain.Student;
import academy.bentodev.javaoneforall.pooClass.association.domain.TeacherExercise;

public class Exercise {
    public static void main(String[] args) {
        Location location = new Location("Rua do retorno");

        Seminary seminary1 = new Seminary("teste de titulo", location);
        Seminary seminary2 = new Seminary("aula de ninjutsu", location);

        TeacherExercise teacher1 = new TeacherExercise("Kakashi", "Ninjutsu");
        Seminary[] seminaries = new Seminary[]{seminary1, seminary2};
        teacher1.setSeminaries(seminaries);

        Student student1 = new Student("Naruto", 16);
        student1.setSeminary(seminary1);

        Student[] students = new Student[]{student1, student1};
        seminary1.setStudents(students);
        seminary2.setStudents(students);

//        seminary1.print();
//        seminary2.print();

        teacher1.print();

//        student1.print();
    }
}
