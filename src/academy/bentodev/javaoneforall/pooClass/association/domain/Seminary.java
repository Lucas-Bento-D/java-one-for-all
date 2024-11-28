package academy.bentodev.javaoneforall.pooClass.association.domain;

public class Seminary {
    private String title;
    private Location location;
    private Student[] students;

    public Seminary(String title){
        this.title = title;
    }
    public Seminary(String title, Location location){
        this.title = title;
        this.location = location;
    }

    public void print(){
        System.out.println("------------ Seminario ------------");
        System.out.println("Titulo seminario: " + this.title);
        System.out.println("Endereço: " + this.location.getAddress());
        if(students == null) return;
        for (int i = 0; i < students.length; i++) {
            System.out.println("Aluno numero: " + i+1);
            System.out.println("Nome: " + students[i].getName());
            System.out.println("idade: " + students[i].getAge());
        }

    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
