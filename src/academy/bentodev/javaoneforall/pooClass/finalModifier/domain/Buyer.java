package academy.bentodev.javaoneforall.pooClass.finalModifier.domain;

public class Buyer {
    private String name;

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
