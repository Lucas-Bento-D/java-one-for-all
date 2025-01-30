package academy.bentodev.javaoneforall.Collections.Domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private long id;
    private String name;
    private double price;

    public Manga(long id, String name, double price){
        Objects.requireNonNull(id, "Id is required for initializate constructor");
        Objects.requireNonNull(name, "Name is required for initializate constructor");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Regras para fazer o Override de compareTo(metodo que vem de da interface Comparable)
     * retorna positivo se this < parametro(o)
     * retorna 0 se this == parametro
     * retorna positivo se this > parametro
     * @param o the object to be compared.
     * @return
     */

    @Override
    public int compareTo(Manga o) {
        // Vamos usar a prop id para comparar
        if(this.id < o.id) {
            return -1;
        } else if (this.id == o.getId()) {
            return 0;
        }else {
            return 1;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Double.compare(price, manga.price) == 0 && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
