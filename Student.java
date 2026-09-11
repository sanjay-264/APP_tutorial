package college.student;

public class Student {
    public void show() {
        System.out.println("Student: Ravi, ID: 101");
    }
}
package college.course;

public class Course {
    public void show() {
        System.out.println("Course: Java");
    }
}
import college.student.Student;
import college.course.Course;

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Course c = new Course();

        s.show();
        c.show();
    }
}