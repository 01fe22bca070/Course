import java.util.ArrayList;
import java.util.List;

public class StudentCourses {
    private List<Course> courses;

    public StudentCourses() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (Course course : courses) {
            System.out.println("Semester: " + course.getSemester());
            System.out.println("Course: " + course.getName());
            System.out.println("Marks: " + course.getMarks());
            System.out.println();
        }
    }
}