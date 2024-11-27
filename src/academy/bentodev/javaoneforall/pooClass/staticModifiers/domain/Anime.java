package academy.bentodev.javaoneforall.pooClass.staticModifiers.domain;

// Bloco de inicialização estatico
public class Anime {
    private String name;
    private static int[] episodes;

    // Ciclo de inicialização de uma classe com bloco de inicialização estatico:
    // 0 - Bloco de inicialização estatico é executado qiamdp a JVM carregar classe
    // 1 - Classe tem um espaço alocado em memoria(endereço de memoria)
    // 2 - cada atributo da classe é criado e instanciado, com valores default ou oque for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static{
        Anime.episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }
    //OBS.: Blocos de inicialização estaticos são executados apenas uma vez

    // caso você tenha varios blocos de inicialização estaticos, eles serão executados
    // em sequencia(o da linha 14, da linha 22, da linha 32..)

    public Anime(String name){
        this.name = name;
    }
    public Anime(){
        for(int episode: episodes){
            System.out.print(episode);
        }
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
