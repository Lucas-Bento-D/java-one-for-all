package academy.bentodev.javaoneforall.pooClass.heritage.domain;
// aqui podemos ver que a classe funcionario acopla fortemente na classe pessoa
// usamos o termo 'fortemente', pois qualquer alteração na classe pessoa por exemplo
// vai precisar ser pensada para se adequar a funcionario

// OBS.: Pensando por esse lado, uma associação, seria um acoplamento
// menos forte que uma herança, pois com ela temos mais opções liberdade de setar dados ou não
public class Employee extends Person{
    private double salary;

    // aqui estamos sobreescrevendo o metodo print de Person
    // ou seja, quando um 'Employee' chamar o metodo print()
    // vai ser esse e não o print() de 'Person'
    public void print(){
        // super é uma referencia ao objeto pai de 'Employee'
        // que é o 'person', sendo assim, nós podemos chamar a função print
        // de person e depois executar algo no print de 'Employee'
        super.print();
        System.out.println(this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
