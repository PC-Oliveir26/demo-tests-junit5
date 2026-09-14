package business;

import java.util.ArrayList;
import java.util.List;

import service.CourseService;

// SUT - System (Method) Under Test (
public class CourseBusiness {


	private CourseService service;

	public CourseBusiness(CourseService service) {
		this.service = service;
	}

	public List<String> retriveCoursesRelatedToSpring(String student) {
		var filteredCourse = new ArrayList<String>();
		var allCourses = service.retriveCouses(student);

		for (String course : allCourses) {
			if (course.contains("Spring")) {
				filteredCourse.add(course);
			}
		}

		return filteredCourse;
	}

}
