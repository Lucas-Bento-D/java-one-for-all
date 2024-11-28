package academy.bentodev.javaoneforall.pooClass.heritage.domain;
// aqui podemos ver que a classe funcionario acopla fortemente na classe pessoa
// usamos o termo 'fortemente', pois qualquer alteração na classe pessoa por exemplo
// vai precisar ser pensada para se adequar a funcionario

// OBS.: Pensando por esse lado, uma associação, seria um acoplamento
// menos forte que uma herança, pois com ela temos mais opções liberdade de setar dados ou não
public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
