package academy.bentodev.javaoneforall.Comportament.Interface;

import academy.bentodev.javaoneforall.Comportament.Domain.Car;

public interface CarPredicate {
    boolean test(Car car);

    /**
     * Lambda sintaxe
     * (param) -> expressao
     * (Car car) -> car.getColor.equals("green")
     * OBS.: lambdas precisam ter retorno(geralmente definido pelo metodo contratual)
     * Lambdas sao funcoes anonimas e tem o como objetivo deixar o codigo mais conciso
     */
}
