public class Student extends User {
    private String classs;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String classs) {
        super(id, firstName, lastName);
        this.classs = classs;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }
}
