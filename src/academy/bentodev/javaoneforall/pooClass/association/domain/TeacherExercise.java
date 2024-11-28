package academy.bentodev.javaoneforall.pooClass.association.domain;

public class TeacherExercise {
    private String name;
    private String specialization;
    private Seminary[] seminaries;

    public TeacherExercise(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

    public TeacherExercise(String name, String specialization, Seminary[] seminaries){
        this.name = name;
        this.specialization = specialization;
        this.seminaries = seminaries;
    }
    public void print(){
        System.out.println("------------ Professor ------------");
        System.out.println("nome: " + this.name);
        System.out.println("nome: " + this.specialization);
        if(this.seminaries == null) return;
        for(Seminary seminary: seminaries){
            System.out.println("--- Seminario ---");
            System.out.println("Seminario: " + seminary.getTitle());
            System.out.println("Endereço: " + seminary.getLocation().getAddress());
            if( seminary.getStudents() == null || seminary.getStudents().length == 0) continue;
            System.out.println("--- Alunos ---");
            for(Student student: seminary.getStudents()){
                System.out.println("Nome: " + student.getName());
                System.out.println("Idade: " + student.getAge());
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSeminaries(Seminary[] seminaries) {
        this.seminaries = seminaries;
    }

    public Seminary[] getSeminaries() {
        return seminaries;
    }
}
