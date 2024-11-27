package academy.bentodev.javaoneforall.pooClass.association.domain;

public class Player {
    private String name;
    private Team team;

    public Player(String name){
        this.name = name;
    }

    public void print(){
        System.out.println(this.name);
        // o uso do if nesse caso é para não termos um null point
        // pois na hora da instancia do objeto, pedimos apenas nome e não time
        if(team != null) System.out.println(this.getTeam().getName());
        // perceba que nesse "Sout", caso o "team" não for nulo, pegamos a função getTeam setada nesta classe
        // e dentro dela acessamos a função getName() que está dentro da classe "Team"
        // isso acontece pois na classe "PlayerTest02" estamos usando o setTeam(estruturado nesta classe) e estamos setando
        // a instancia "team", isso seta não só as propriedades, mas como os metodos
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }
}
