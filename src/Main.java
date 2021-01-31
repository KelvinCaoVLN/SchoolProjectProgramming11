public class Main {
    public static void main(String[] args) {
        //This allows the code to edit and use the array lists in the school class.
        School newSchool = new School();

        //These are the different courses the teacher will teach
        newSchool.subjects.add("Math");
        newSchool.subjects.add("Science");
        newSchool.subjects.add("Socials");
        newSchool.subjects.add("English");
        newSchool.subjects.add("PE");

        //I am adding in the teachers and randomizing what courses they will teach.
        newSchool.teachers.add(new Teacher("James", "Smith", newSchool.subjects.get((int)(Math.random()*4))));
        newSchool.teachers.add(new Teacher("Emma", "Philips", newSchool.subjects.get((int)(Math.random()*4))));
        newSchool.teachers.add(new Teacher("Sophia", "Young", newSchool.subjects.get((int)(Math.random()*4))));

        //These are the 10 students that are added to the list.
        newSchool.students.add(new Student("Jimmy", "Wilson"));
        newSchool.students.add(new Student("Doris", "Zhou"));
        newSchool.students.add(new Student("Denise", "Smith"));
        newSchool.students.add(new Student("Kenny", "Thompson"));
        newSchool.students.add(new Student("Kevin", "Cho"));
        newSchool.students.add(new Student("Jason", "Chow"));
        newSchool.students.add(new Student("Aaron", "Carter"));
        newSchool.students.add(new Student("Zoe", "Lee"));
        newSchool.students.add(new Student("Rachel", "Chung"));
        newSchool.students.add(new Student("Jesse", "Miller"));

        //List of students are printed.
        System.out.println();
        System.out.println("Students list");
        for (int i = 0; i < newSchool.students.size(); i++) {
            System.out.println("Name: " + newSchool.students.get(i).getFirstName() + " " +newSchool.students.get(i).getLastName()+ "\t Grade: " + newSchool.students.get(i).getGrade() + "\t Student Number: " + newSchool.students.get(i).getStudentNumber());
        }

        //List of teachers are printed
        System.out.println();
        System.out.println("Teachers List");
        for (int i = 0; i < newSchool.teachers.size(); i ++) {
           System.out.println("Name: " + newSchool.teachers.get(i).getFirstName() + " " + newSchool.teachers.get(i).getLastName() + "\t subject: " + newSchool.teachers.get(i).getSubject());
        }

        //Remove the second last and last students from the student list.
        int removeStudent = newSchool.students.size() - 1;
        newSchool.students.remove(removeStudent);
        newSchool.students.remove(removeStudent - 1);

        //Removes the last teacher from the list.
        int removeTeacher = newSchool.teachers.size() - 1;
        newSchool.teachers.remove(removeTeacher);

        //Prints second student list.
        System.out.println();
        System.out.println("Students list");
        for (int i = 0; i < newSchool.students.size(); i++) {
            System.out.println("Name: " + newSchool.students.get(i).getFirstName() + " " +newSchool.students.get(i).getLastName()+ "\t Grade: " + newSchool.students.get(i).getGrade() + "\t Student Number: " + newSchool.students.get(i).getStudentNumber());
        }

        //prints second teacher list.
        System.out.println();
        System.out.println("Teachers List");
        for (int i = 0; i < newSchool.teachers.size(); i ++) {
            System.out.println("Name: " + newSchool.teachers.get(i).getFirstName() + " " + newSchool.teachers.get(i).getLastName() + "\t subject: " + newSchool.teachers.get(i).getSubject());
        }
    }
}
