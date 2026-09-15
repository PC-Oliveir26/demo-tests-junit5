package business;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.CourseService;

class CourseBusinessMockWithBDDTest {

	CourseService mockService;
	CourseBusiness business;
	List<String> courses;

	@BeforeEach
	void setup() {
		mockService = mock(CourseService.class);
		business = new CourseBusiness(mockService);
		
		courses = Arrays.asList(
				"Formação Java Testing 2026: Testes Automatizados com JUnit, Mockito, Spring Boot, TDD e TestContainers",
				"Formação Spring Boot 2026: do Zero ao Deploy na AWS e GCP com Java, Docker e Kubernetes",
				"Formação Spring AI 2026: Inteligência Artificial com Java, Spring Boot, ChatGPT, DeepSeek, Claude e MCP",
				"Formação Microsserviços 2026: do Zero ao Deploy na Google Cloud com Spring Boot, Kubernetes e Docker",
				"Formação Docker e Kubernetes 2026: do Zero ao Deploy Profissional na AWS, Azure e GCP com GitHub Actions",
				"Docker do Zero à Maestria - Contêinerização Desmistificada",
				"Java Continuous Integration e Delivery com AWS e Github Actions",
				"Formação Spring Boot com Kotlin: REST APIs Profissionais do Zero ao Deploy na AWS com Docker e Kubernetes",
				"Carreira em TI do Zero ao Exterior: Currículo, Entrevistas, Negociação e Crescimento Profissional");
	}

	@Test
	void testCourseRelatedToSpring_When_UsingAMock() {
		
//		given / arrange
		given(mockService.retriveCouses("Leandro"))
		.willReturn(courses);
//		
		var filteredCourses = business.retriveCoursesRelatedToSpring("Leandro");

		assertThat(filteredCourses.size(), is(4));

	}

}
