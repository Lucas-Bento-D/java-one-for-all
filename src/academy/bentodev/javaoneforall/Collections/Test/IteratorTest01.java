package academy.bentodev.javaoneforall.Collections.Test;

import academy.bentodev.javaoneforall.Collections.Domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {

        /**
         * Podemos usar também o LinkedList onde basicamente cada item de um array, sabe do anterior a ele e o proximo também
         * e levando em conta o big O notation: https://www.bigocheatsheet.com/
         * percebemos que o LinkedList é mais performatico que o Array para deletar itens
         */
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5, "Berserk", 19.9, 0));
        mangas.add(new Manga(4, "Hellsing", 9.6, 5));
        mangas.add(new Manga(3, "Attack on Titan", 3.2, 12));
        mangas.add(new Manga(2, "Pokemon", 11.20, 3));
        mangas.add(new Manga(1, "Dragon ball Z", 2.99, 7));

        // Vai gerar um erro
//        for (Manga manga: mangas){
//            if(manga.getQuantity() == 0){
//                mangas.remove(manga);
//            }
//            System.out.println(manga);
//        }

        // Iterator basicamente vai ver se tem um proximo item e vai aplicar a l[ogica nele se houver
//        Iterator<Manga> iterator = mangas.iterator();
//        while(iterator.hasNext()){
//            Manga manga = iterator.next();
//            if(manga.getQuantity() == 0){
//                iterator.remove();
//            }
//        }

        System.out.println(mangas);

        // O java também implementou o removeIf que basicamente recebe uma variavel de referencia e uma lógica de negocio para remover um item
        mangas.removeIf(manga -> manga.getQuantity() == 0);
        System.out.println(mangas);

    }
}
