package academy.bentodev.javaoneforall.pooClass.methods.test;

import academy.bentodev.javaoneforall.pooClass.methods.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Lucas";
        employee1.age = 26;
        employee1.salaries = new double[]{1000, 2000, 1500, 3200};

        Employee employee2 = new Employee();
        employee2.name = "Karen";
        employee2.age = 22;
        employee2.salaries = new double[]{1200, 1800, 1100, 2200};;

        employee1.print();
        employee1.average();

        employee2.print();
        employee2.average();


    }

}
