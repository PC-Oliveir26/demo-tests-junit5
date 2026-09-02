package userTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import UserJunit.User;

public class UserTest {

	private User user;

//	Before each test 
	@BeforeEach
	public void createUser() {
		user = new User();
		user.setSalary(1000d);
		user.setName("Peter");
	}
	
//	After each test
	@AfterEach
	public void afterEach() {
		System.out.println(".....................");
	}
//	Before All
	@BeforeAll
	public static void beforeAll() {
		System.out.print("starting test\n\n");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.print("\nfished all test");
	}

	@Test
	public void testReadjustmentWithHighGrade() {
		user.readjustment(9.0);
		double salary = user.getSalary();
		Assertions.assertEquals(1500, salary);
		System.out.println(user.getSalary()+ " - High Grade");
	}

	@Test
	public void testReadjustmentWithLowerGrade() {
		user.readjustment(8.0);
		double salary = user.getSalary();
		Assertions.assertEquals(1100, salary);
		System.out.println(user.getSalary()+ " - High Lower");
	}

}
