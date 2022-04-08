public class Pro2_64010972 {
    public static void main(String[] args) {
        Course course = new Course("Data Structures");
        course.addStudent("Rattanapornchai");
        course.addStudent("Porpor");
        course.addStudent("Thanatat");
        course.dropStudent("Porpor");
        System.out.println("Student in the " + course.getCourseName());
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(course.getStudents()[i]);
        }
        course.clear();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(course.getStudents()[i]);
        }
    }
}

class Course {
    private String courseName;
    private String[] students = new String[2];
    private int numberOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    public void dropStudent(String student) {
        boolean dropped = false;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student) && !dropped) {
                students[i] = null;
                dropped = true;
            } else if (dropped) {
                String temp = students[i];
                students[i] = students[i - 1];
                students[i - 1] = temp;
            }
        }
        if (dropped) {
            numberOfStudents--;
        }
    }

    public void clear() {
        students = new String[2];
        numberOfStudents = 0;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}