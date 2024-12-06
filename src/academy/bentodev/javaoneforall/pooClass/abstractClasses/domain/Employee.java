package academy.bentodev.javaoneforall.pooClass.abstractClasses.domain;

/**
 * Para esse caso, percebemos que Employee não fazia sentido, por não ter um
 * cargo especifico e todo cargo que fizessemos, iriamos extender de Employee.
 * Sendo assim, faz muito mais sentido usar o "abstract" para dizer que a classe
 * é um simples "template" a ser extendido por outras classes mais especializadas,
 * como "Manager" por exemplo.
 * OBS.: Uma classe abstrata não pode ser instanciada, ela só poderar ser extendida como
 * uma classe pai, sempre.
 */
public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
