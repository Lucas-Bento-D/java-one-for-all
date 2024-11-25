package academy.bentodev.javaoneforall.conditionalStructs;

public class Exercicies {

    public static void main(String[] args) {
        double yearSalary = 70000;
        double firtTax = 9.7 / 100;
        double secondTax = 37.35 / 100;
        double ThirdTax = 49.50 / 100;
        double impostValue;

        if(yearSalary <= 34712){
            impostValue = yearSalary * firtTax;
        } else if (yearSalary > 34712 && yearSalary <= 68507) {
            impostValue = yearSalary * secondTax;
        }else{
            impostValue = yearSalary * ThirdTax;
        }
        System.out.println("Com base no seu salario: " + yearSalary + ". Você pagará: " + impostValue + " de imposto.");
    }
}
