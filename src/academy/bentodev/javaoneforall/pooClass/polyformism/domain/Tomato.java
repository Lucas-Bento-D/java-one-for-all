package academy.bentodev.javaoneforall.pooClass.polyformism.domain;

public class Tomato extends Product{
    public static final double TAX_PER_CENT = 0.03;
    private int validate;
    public Tomato(String name, double value){
        super(name, value);
    };
    @Override
    public double calcTax(){
        double value = this.getValue();
        System.out.println("calculando imposto: tomate");
        return value * TAX_PER_CENT;
    }

    public int getValidate() {
        return validate;
    }

    public void setValidate(int validate) {
        this.validate = validate;
    }
}
