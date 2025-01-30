package academy.bentodev.javaoneforall.Collections.Domain;

import java.util.Objects;

public class Manga {
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
