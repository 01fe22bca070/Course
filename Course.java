public class Course{
    private String semester;
    private String name;
    private int marks;

    public Course(String semester, String name, int marks) {
        this.semester = semester;
        this.name = name;
        this.marks = marks;
    }

    public String getSemester() {
        return semester;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}