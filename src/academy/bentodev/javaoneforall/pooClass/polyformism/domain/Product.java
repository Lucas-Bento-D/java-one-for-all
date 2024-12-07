package academy.bentodev.javaoneforall.pooClass.polyformism.domain;

public abstract class Product implements Taxable{
    private String name;
    private double value;

    public Product(String name, double value){
        this.name = name;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
