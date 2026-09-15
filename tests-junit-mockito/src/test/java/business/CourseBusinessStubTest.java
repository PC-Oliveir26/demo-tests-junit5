package business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import service.CourseService;
import service.CourseServiceStub;

class CourseBusinessTest {

	@Test
	void testCourseRelatedToSpring_When_UsingAStub() {
		CourseService stubService = new CourseServiceStub();
		CourseBusiness business = new CourseBusiness(stubService);
		
		var filteredCourses =
				business.retriveCoursesRelatedToSpring("Leandro");
		
		assertEquals(5, filteredCourses.size());
		
	}

}
