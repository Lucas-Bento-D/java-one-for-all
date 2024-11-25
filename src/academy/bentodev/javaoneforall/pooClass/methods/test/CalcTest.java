package academy.bentodev.javaoneforall.pooClass.methods.test;

import academy.bentodev.javaoneforall.pooClass.methods.domain.Calc;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.sum(1, 2);
        calc.subtract(3, 2);
        calc.multiplier(2, 3);

        double result = calc.division(20, 3);
        System.out.println(result);

        System.out.println("======================");
        int[] numbers = {1,2,3,4};
        calc.sumArr(numbers);

        System.out.println("======================");
        calc.sumVarargs(1,2,3,4);
    }
}
