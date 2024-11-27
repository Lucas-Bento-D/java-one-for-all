package academy.bentodev.javaoneforall.pooClass.association.test;

import academy.bentodev.javaoneforall.pooClass.association.domain.School;
import academy.bentodev.javaoneforall.pooClass.association.domain.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jiraya");
        Teacher teacher2 = new Teacher("Kakashi");

        Teacher[] teachers = new Teacher[]{teacher, teacher2};
        School school = new School("Elite", teachers);

        school.print();
    }
}
