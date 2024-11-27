package academy.bentodev.javaoneforall.pooClass.association.domain;

public class Player {
    private String name;

    public Player(String name){
        this.name = name;
    }

    public void print(){
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
