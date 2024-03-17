import java.time.LocalDate;
import java.time.Period;


public class Student {
    private String name;
    private LocalDate dateOfBirth;

    public Student(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
