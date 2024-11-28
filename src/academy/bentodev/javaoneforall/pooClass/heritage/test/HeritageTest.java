package academy.bentodev.javaoneforall.pooClass.heritage.test;

import academy.bentodev.javaoneforall.pooClass.heritage.domain.Address;
import academy.bentodev.javaoneforall.pooClass.heritage.domain.Employee;
import academy.bentodev.javaoneforall.pooClass.heritage.domain.Person;

public class HeritageTest {
    public static void main(String[] args) {
        Address address = new Address("rua do retorno", "12312");
        Person person = new Person("Lucas", "19863");
        person.setAddress(address);

        person.print();

        Employee employee = new Employee("name", "13412");
        employee.setSalary(1000);
        Address address2 = new Address("rua do sei la", "123112");
        employee.setAddress(address2);
        System.out.println("-----------------");
        employee.print();
    }
}
