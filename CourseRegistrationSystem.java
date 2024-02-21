
public class CourseRegistrationSystem {

	public static void main(String[] args) {
	
		CourseListing courseListing = new CourseListing();

        // Sample courses
        Course c1 = new Course("C001", "Java Programming", "Introduction to Java programming", 30, "Monday, Wednesday");
        Course c2 = new Course("C002", "Database Management", "Database concepts and SQL", 25, "Tuesday, Thursday");
        Course c3 = new Course("C003", "Web Development", "HTML, CSS, and JavaScript", 20, "Friday");

        courseListing.courses.add(c1);
        courseListing.courses.add(c2);
        courseListing.courses.add(c3);

        // Sample student
        Student student1 = new Student("S001", "John Doe");

        // Display available courses
        courseListing.displayCourses();

        // Register student for a course
        courseListing.registerStudentForCourse(student1, c1);

        // Display student's registered courses
        System.out.println(student1);

        // Remove student from a course
        courseListing.removeStudentFromCourse(student1, c1);

        // Display updated student's registered courses
        System.out.println(student1);
    }


}