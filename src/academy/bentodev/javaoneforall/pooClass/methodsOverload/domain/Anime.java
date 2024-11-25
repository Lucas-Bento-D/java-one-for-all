package academy.bentodev.javaoneforall.pooClass.methodsOverload.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;

    // temos aqui duas funções com o mesmo nome, mas com parametros diferentes
    // o java nomeia essa pratica como "sobrecarga" de metodos
    // a sobrecarga de metodos tem como objetivo adicionar parametros em uma função
    // mas utilizar o mesmo nome, fazendo elas funcionarem em conjuto com o chamado dependendo do parametro
    public void init(String name, String type, int episodes){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    public void init(String name, String type, int episodes, String gender){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.gender);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }
    public int getEpisodes(){
        return this.episodes;
    }
}
