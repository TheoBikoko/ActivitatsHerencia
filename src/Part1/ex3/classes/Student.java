package Part1.ex3.classes;

public class Student extends Person{
    protected String cycle;
    protected int course;

    public Student(String name, String address, String cycle, int course) {
        super(name, address);
        this.cycle = cycle;
        this.course = course;
        System.out.println("Soc el constructor de la classe Student");
    }

    protected String getCycle() {
        return cycle;
    }

    protected void setCycle(String cycle) {
        this.cycle = cycle;
    }

    protected int getCourse() {
        return course;
    }

    protected void setCourse(int course) {
        this.course = course;
    }
}
