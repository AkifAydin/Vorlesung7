public class Student {
    String sname;
    int alter;

    public Student(String name, int alter) {
        this.sname = name;
        this.alter = alter;
    }

    public static void main(String[] args) {
        Student student = new Student("Onur",24);
        //System.out.println(student);
    }
}
