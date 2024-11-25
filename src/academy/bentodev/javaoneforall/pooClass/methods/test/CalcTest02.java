package academy.bentodev.javaoneforall.pooClass.methods.test;


import academy.bentodev.javaoneforall.pooClass.methods.domain.Calc;

public class CalcTest02 {
    public static void main(String[] args) {

        Calc calc = new Calc();
        int num1 = 1;
        int num2 = 2;
        calc.changeNumbers(num1, num2);
        System.out.println("------------------------");
        System.out.println(num1 + " " + num2);
    }

}
