public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Emre");
        instructor.setLastName("Sahin");
        instructor.setBranch("Java");

        Student student = new Student();
        student.setId(1);
        student.setFirstName("Karen");
        student.setLastName("Armstrong");
        student.setClasss("Ea class");
        

        BaseManager baseManager = new BaseManager();
        baseManager.add(new InstructorManager());
    }
}