package academy.bentodev.javaoneforall.pooClass.heritage.test;

import academy.bentodev.javaoneforall.pooClass.heritage.domain.Address;
import academy.bentodev.javaoneforall.pooClass.heritage.domain.Employee;
import academy.bentodev.javaoneforall.pooClass.heritage.domain.Person;

public class HeritageTest {
    public static void main(String[] args) {
        Address address = new Address("rua do retorno", "12312");
        Person person = new Person();
        person.setName("Lucas");
        person.setCpf("18741");
        person.setAddress(address);

        person.print();

        Employee employee = new Employee();
        employee.setName("funcionario");
        employee.setSalary(1000);
        employee.setCpf("213");
        System.out.println("-----------------");
        employee.print();
    }
}
