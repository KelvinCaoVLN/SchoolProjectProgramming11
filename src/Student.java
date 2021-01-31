public class Student {

    private String firstName;
    private String lastName;
    private static int randomGrade;
    private static int studentNumberModel = 1;
    private int grade;
    private int studentNumber;

    //The grade variable is randomised between 8 and 12 and the student number increase by one for every student.
    Student (String firstName, String lastName) {
        randomGrade = (int) (Math.random()* 5) + 8;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = randomGrade;
        this.studentNumber = studentNumberModel;
        studentNumberModel++;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
