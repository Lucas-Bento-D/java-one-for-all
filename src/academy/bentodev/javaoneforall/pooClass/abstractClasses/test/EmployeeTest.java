package academy.bentodev.javaoneforall.pooClass.abstractClasses.test;

import academy.bentodev.javaoneforall.pooClass.abstractClasses.domain.Developer;
import academy.bentodev.javaoneforall.pooClass.abstractClasses.domain.Employee;
import academy.bentodev.javaoneforall.pooClass.abstractClasses.domain.Manager;

public class EmployeeTest {
    public static void main(String[] args) {

        Manager manager1 = new Manager("nami", 5000);
        System.out.println(manager1);

        Developer developer1 = new Developer("Lucas", 1002);
        System.out.println(developer1);
    }
}
