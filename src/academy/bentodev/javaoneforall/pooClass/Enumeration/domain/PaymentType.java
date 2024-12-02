package academy.bentodev.javaoneforall.pooClass.Enumeration.domain;

/**
 * Ainda buscando deixar o código mais limpo e em alguns casos, com menos condicionais.
 * Podemos adicionar funcionalidades com as escolhas dos enums, como função de desconto,
 * como podemos ver aqui no PaymentType.
 * Como a classe PaymentType é acessivel, podemos acessar pelos enums o metodo para calcular diconto por exemplo
 */

public enum PaymentType {
    DEBIT {
        @Override
        public double DiscountCalc(double value) {
            return value * 0.1;
        }
    },
    CREDIT{
        @Override
        public double DiscountCalc(double value) {
            return value * 0.05;
        }
    };

    /**
     * Para sobreescrevermos um metodo como feito acima, precisamos que esse metodo
     * exista na classe, mas após termos os metodos sobreescritos, perdemos a necessidade
     * de uso da função original nesse caso, para deixar o código mais intuitivo, usamos
     * o "abstract" para dizer que essa é uma função puramente abstrata e que não existe de fato
     * com isso, conseguimos sobreescreve-la de forma correta e sem ferir nenhuma regra do java
     *
     * OBS.: Métodos abstratos não podem ter corpo({})
     * OBS. 2: Métodos abstratos precisam ser sobreescritos, caso não forem, teremos um erro de compilação
     * @param value
     * @return
     */
    public abstract double DiscountCalc(double value);
}
