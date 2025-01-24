package academy.bentodev.javaoneforall.Regex.Test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {

        /**
         * Podemos utilizar a classe scanner para fazer o split em uma string, porem o funcionamento é um pouco diferente
         * Scanner trabalha com 2 ponteiros para o split, primeiro ele verifica se tem um proximo valor e depois ele mostra
         * o atual, por isso no exemplo, nós usamos o while executando o método hasNext, pois o scanner verifica se existirá
         * um próximo valor e depois printa o valor atual.
         */

        String text = "Lvei, Eren, Mikasa,200,true";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");

        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean "+ b);
            }else{
                System.out.println(scanner.next().trim());

            }
        }

    }
}
