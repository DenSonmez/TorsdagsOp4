import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Course> skoleFag = new ArrayList<>();


   public Student(String name) {
        this.name = name;

    }

    public void addCourse(Course fag) {
        skoleFag.add(fag);

    }
@Override
    public String toString() {
        return "Student " + name + " fag " + skoleFag ;

    }
}
