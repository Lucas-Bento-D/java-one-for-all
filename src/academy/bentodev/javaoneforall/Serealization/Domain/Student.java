package academy.bentodev.javaoneforall.Serealization.Domain;

import java.io.*;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 8659165867913043972L;

    private long id;
    private String name;
    // transient é usado para setar que o atributo não deve ser serializado
    private transient String password;
    private static String schoolName = "School name";

    private Class classe;

    public Student(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oOs){
        try{
            oOs.defaultWriteObject();
            oOs.writeUTF(classe.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // serial foi implementado apenas na versao 14
    @Serial
    private void readObject(ObjectInputStream oOs){
        try{
            oOs.defaultReadObject();
            String className = oOs.readUTF();
            classe = new Class(className);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", School='" + schoolName + '\'' +
                '}';
    }

    public void setClasse(Class classe) {
        this.classe = classe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
