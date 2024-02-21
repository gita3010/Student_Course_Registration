import java.util.*;

class Student {

	String studentID;
	String name;
	List<Course>registeredCourses;
	
	public Student(String studentID, String name)
	{
		this.studentID=studentID;
		this.name=name;
		this.registeredCourses = registeredCourses;
	}
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", registeredCourses=" + registeredCourses +
                '}';
    }

}