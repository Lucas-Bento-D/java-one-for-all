package academy.bentodev.javaoneforall.Exeptions.exception.test;

import academy.bentodev.javaoneforall.Exeptions.exception.domain.Employee;
import academy.bentodev.javaoneforall.Exeptions.exception.domain.InvalidLoginException;
import academy.bentodev.javaoneforall.Exeptions.exception.domain.Person;

import java.io.FileNotFoundException;

public class SubscriptionWithExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        employee.save();
        try{
            person.save();
        } catch (FileNotFoundException | InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }

}
