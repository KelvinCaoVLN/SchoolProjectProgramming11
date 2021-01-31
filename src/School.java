import java.util.ArrayList;
public class School {
    School() {
        this.teachers = teachers;
        this.students = students;
        this.subjects = subjects;
    }

    ArrayList<Teacher> teachers = new ArrayList<>();

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    ArrayList<Student> students = new ArrayList<>();

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    ArrayList<String> subjects =  new ArrayList<>();
}
