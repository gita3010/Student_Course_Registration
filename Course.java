// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

public class Course {

	String code;
	String title;
	String description;
	int capacity;
	String schedule;
	public Course(String code, String title, String description, int capacity, String schedule) {
		
		this.code = code;
		this.title = title;
		this.description = description;
		this.capacity = capacity;
		this.schedule = schedule;
	}
	
	public String toString() {
		
		return "Course{"+
				"code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", capacity=" + capacity +
                ", schedule='" + schedule + '\'' +
                '}';
	
	}
	
}