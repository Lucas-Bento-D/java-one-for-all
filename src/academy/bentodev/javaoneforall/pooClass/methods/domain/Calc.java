package academy.bentodev.javaoneforall.pooClass.methods.domain;

public class Calc {
    public void sum(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public void subtract(int num1, int num2){
        System.out.println(num1 - num2);
    }
    public void multiplier(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double division( double num1, double num2){
        if(num2 == 0) return 0;
        return num1/num2;
    }
    public void changeNumbers(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
    public void sumArr(int[] numbers){
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
//    se utilizar o varargs, você não consegue usar outros parametros apos ele, então ele precisa ser sempre o ultimo parametro
//    basicamente o java substitui esse varargs para o array por tras dos panos
    public void sumVarargs(int... numbers){
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
