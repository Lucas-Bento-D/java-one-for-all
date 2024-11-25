package academy.bentodev.javaoneforall.pooClass.coupling.test;

import academy.bentodev.javaoneforall.pooClass.coupling.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Lucas");
        person1.setAge(10);
        person1.print();
    }
}
