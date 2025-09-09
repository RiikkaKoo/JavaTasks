import java.io.Serializable;

public class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String code, String courseName, String instructor) {
        this.courseCode = code;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "\nCOURSE:\n   Course code: " + courseCode + "\n   Course name: " + courseName + "\n   Instructor: " + instructor;
    }
}
