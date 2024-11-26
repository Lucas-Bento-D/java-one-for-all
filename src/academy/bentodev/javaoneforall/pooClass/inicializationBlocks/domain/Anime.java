package academy.bentodev.javaoneforall.pooClass.inicializationBlocks.domain;

public class Anime {
    private String name;
    private int[] episodes;

    // Ciclo de inicialização de uma classe:
        // 1 - Classe tem um espaço alocado em memoria(endereço de memoria)
        // 2 - cada atributo da classe é criado e instanciado, com valores default ou oque for passado
        // 3 - Bloco de inicialização é executado
        // 4 - Construtor é executado
    {
        // Toda classe pode receber um bloco de inicialização
        // esse bloco serve para inciar itens por padrão dentro da classe
        this.episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }

    public Anime(String name){
        this.name = name;
    }
    public Anime(){
        for(int episode: episodes){
            System.out.print(episode);
        }
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
