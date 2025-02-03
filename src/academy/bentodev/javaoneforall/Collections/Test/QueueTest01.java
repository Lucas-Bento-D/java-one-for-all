package academy.bentodev.javaoneforall.Collections.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("B");

        for (String s: queue){
            System.out.println(s);
        }
        /**
         * peek() - mostra o primeiro elemento
         * poll() - remove o primeiro elemento da fila
         * offer() - adiciona um elemento na fila, se diferenciando do metodo add() que caso nao consiga adicionar o elemento na fila
         * retorna um exception, o offer retorna apenas um boolean, true para adicionado e false para não adicionado
         */
        System.out.println(queue);
    }
}
