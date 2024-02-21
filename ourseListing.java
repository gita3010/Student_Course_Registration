import java.util.*;

class CourseListing {
    List<Course> courses;

    public CourseListing() {
        this.courses = new ArrayList<>();
    }

    public void displayCourses() {
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public void registerStudentForCourse(Student student, Course course) {
        if (course.capacity > 0) {
            student.registeredCourses.add(course);
            course.capacity--;
            System.out.println(student.name + " registered for " + course.title);
        } else {
            System.out.println("Sorry, " + course.title + " is already full.");
        }
    }

    public void removeStudentFromCourse(Student student, Course course) {
        student.registeredCourses.remove(course);
        course.capacity++;
        System.out.println(student.name + " removed from " + course.title);
    }
}