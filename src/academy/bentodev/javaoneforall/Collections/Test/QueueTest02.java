package academy.bentodev.javaoneforall.Collections.Test;

import academy.bentodev.javaoneforall.Collections.Domain.Consumer;
import academy.bentodev.javaoneforall.Collections.Domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        /**
         * Queue basicamente é a classe para fila e a classe Priority é a fila por linha de prioridade, ela existe pois podemos setar
         * a prioridade desejada com um método que acesse comparator
         */
        Consumer consumer = new Consumer("Ichigo");
        Queue<Consumer> consumerQueue = new PriorityQueue<>();

        /**
         * Para adicionar um item na fila que seja um objeto, esse objeto precisa implementar a interface Comparable
         */

        Manga manga1 = new Manga(1L, "Naruto", 2.99);
        Queue<Manga> mangaQueue = new PriorityQueue<>(new MangaPriceComparator());

//        consumerQueue.add(consumer);
        mangaQueue.add(manga1);

        System.out.println(manga1);
    }
}
