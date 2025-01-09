package academy.bentodev.javaoneforall.String.Test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "   Luffy   ";
        String numbers = "012345";

        //charAt: método para trazer um caractere em uma posição da string, retornando erro caso tentarmos pegar um index que não tem na string.
        System.out.println(name.charAt(1));

        /**
         * length(): método para descobrir o tamanho da string.
         * Perceba, o método length é diferende do atributo length que usamos para descobrir o tamanho de um array.
         */
        System.out.println(name.length());

        // replace: método para fazer replace de valores na string por outros valores.
        System.out.println(name.replace("f", "l"));

        // toLowerCase: método que deixa todos os caracteres em minusculo
        System.out.println(name.toLowerCase());

        // toUpperCase: método que deixa todos os caracteres em maiusculo
        System.out.println(name.toUpperCase());

        // substring: método para pegar parte de uma string, dando o valor a posição do array inicial e a posição do array final(sendo que essa não será mostrada no resultado)
        // se usarmos o método sem adicionar a posição final, o resultado vai ser a posição inicial até a final da string
        System.out.println(numbers.substring(1, 4));
        System.out.println(numbers.substring(1));

        // trim: remove valores em branco no começo e no final da string
        System.out.println(name.trim());
    }
}
