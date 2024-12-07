package academy.bentodev.javaoneforall.pooClass.polyformism.domain;

public class Computer extends Product{
    public static final double TAX_PER_CENT = 0.21;
    public Computer(String name, double value){
        super(name, value);
    }
    @Override
    public double calcTax(){
        double value = this.getValue();
        System.out.println("calculando imposto: computador");
        return value * TAX_PER_CENT;
    }

}
