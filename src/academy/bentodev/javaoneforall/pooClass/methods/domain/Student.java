package academy.bentodev.javaoneforall.pooClass.methods.domain;

public class Student {
    public String name;
    public int age;
    public char sex;

    public void print(){
//        this é um termo usado para pegar o contexto usado no momento
//        ou seja, se o objeto setado e chamado é 'student1', ele vai pegar esse contexto e assim por diante
//        conseguimos chamar as variaveis com contexto sem o this, porem é uma boa prática usa-lo
        System.out.println("-------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }
}
