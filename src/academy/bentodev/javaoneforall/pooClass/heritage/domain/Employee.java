package academy.bentodev.javaoneforall.pooClass.heritage.domain;
// aqui podemos ver que a classe funcionario acopla fortemente na classe pessoa
// usamos o termo 'fortemente', pois qualquer alteração na classe pessoa por exemplo
// vai precisar ser pensada para se adequar a funcionario

// OBS.: Pensando por esse lado, uma associação, seria um acoplamento
// menos forte que uma herança, pois com ela temos mais opções liberdade de setar dados ou não
public class Employee extends Person{
    private double salary;

    /**
     * Para classes de herança, temos uma inicialização diferente
     * 1 - Temos a inicialização static da super classe (nesse caso 'Person')
     * 2 - inicialização da classe que está estendendo(nesse caso 'Employee')
     *
     * 3 - Alocação de memoria para o objeto da super classe
     * 4 - Criação dos atributos e inicialização com valores default ou oque for passado da super classe
     * 5 - inicialização de todos os blocos de inicialização da super classe
     * 6 - inicialização do construtor da super classe
     *
     * 7 - Alocação de memoria para o objeto da classe filha
     * 8 - Criação dos atributos e inicialização com valores default ou oque for passado da classe filha
     * 9 - inicialização de todos os blocos de inicialização filho
     * 10 - inicialização do construtor do filho
     * */

    static{
        System.out.println("Dentro do bloco inicialização estático de funcionario");
    }

    {
        System.out.println("Dentro do bloco inicialização de funcionario1");
    }
    {
        System.out.println("Dentro do bloco inicialização de funcionario2");
    }

    public Employee(String name, String cpf){
        // Quando chamamos 'super' com os parametros name e cpf, estamos chamando o
        // construtor 'Person' e passando os parametros desejados
        // Alem disso, o super precisa ser sempre a primeira linha da função
        // ou seja, não conseguimos usar super e this na mesma função
        // pois o this tem a mesma regra
        super(name, cpf);
        System.out.println("dentro do construtor funcionario");
    }

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
