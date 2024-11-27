package academy.bentodev.javaoneforall.pooClass.association.domain;

public class School {
    private String name;
    private Teacher[] teachers;

    public School(String name){
        this.name = name;
    }

    public School(String name,  Teacher[] teachers){
        this.name = name;
        this.teachers = teachers;
    }

    public void print(){
        System.out.println(this.name);
        if(teachers == null) return;

        System.out.println("---------------------");
        System.out.println("Professores: ");
        for(Teacher teacher: teachers){
            System.out.println(teacher.getName());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }
}
