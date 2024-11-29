package academy.bentodev.javaoneforall.pooClass.overwriting.domain;

public class Anime {
    private String name;

    public Anime(String name){
        this.name = name;
    }

    /**
     * conseguimos sobreescrever funções de outras classes desde que:
     * Tenhamos o mesmo nome de função
     * o modificador de acesso não seja restritivo(algo como private por exemplo)
     * É uma boa pratica também usar o termo "@Override" para quando iremos sobreescrever
     * Isso é uma boa pratica, pois se caso tivermos alguma mudança de nome de função por exemplo,
     * O @Override gera um erro de compilação
     */
    @Override
    public String toString(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
