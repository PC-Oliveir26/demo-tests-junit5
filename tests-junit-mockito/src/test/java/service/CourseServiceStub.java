package service;

import java.util.Arrays;
import java.util.List;

public class CourseServiceStub implements CourseService{


	public List<String> retriveCouses(String student) {		
		return Arrays.asList(
				"Formação Java Testing 2026: Testes Automatizados com JUnit, Mockito, Spring Boot, TDD e TestContainers",
				"Formação Spring Boot 2026: do Zero ao Deploy na AWS e GCP com Java, Docker e Kubernetes",
				"Formação Spring AI 2026: Inteligência Artificial com Java, Spring Boot, ChatGPT, DeepSeek, Claude e MCP",
				"Formação Microsserviços 2026: do Zero ao Deploy na Google Cloud com Spring Boot, Kubernetes e Docker",
				"Formação Docker e Kubernetes 2026: do Zero ao Deploy Profissional na AWS, Azure e GCP com GitHub Actions",
				"Docker do Zero à Maestria - Contêinerização Desmistificada",
				"Java Continuous Integration e Delivery com AWS e Github Actions",
				"Formação Spring Boot com Kotlin: REST APIs Profissionais do Zero ao Deploy na AWS com Docker e Kubernetes",
				"Carreira em TI do Zero ao Exterior: Currículo, Entrevistas, Negociação e Crescimento Profissional"
				);
	}

}
