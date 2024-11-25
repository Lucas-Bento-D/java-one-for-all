package academy.bentodev.javaoneforall.pooClass.methods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void print(){
        System.out.println("------------------");
        System.out.println(this.name);
        System.out.println(this.age);
        if(this.salaries == null) return;
        for (int i = 0; i < this.salaries.length; i++) {
            System.out.println(i + "º salario: " + this.salaries[i]);
        }
    }
    public void average(){
        if(this.salaries == null) return;
        double total = 0;
        for(double salary: this.salaries){
            total += salary;
        }
        System.out.println("Média salarial: " + total/this.salaries.length);
        System.out.println("------------------");
    }
}
