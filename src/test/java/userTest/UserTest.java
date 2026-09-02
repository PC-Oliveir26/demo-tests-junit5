package userTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import UserJunit.User;

public class UserTest {

	public void createUser() {

	}

	@Test
	public void testReadjustmentWithHighGrade() {
		User user = new User();
		user.setSalary(1000d);
		user.setName("Peter");
		user.readjustment(9.0);
		double salary = user.getSalary();
		Assertions.assertEquals(1500, salary);
		System.out.println(user.getSalary());

	}

	@Test
	public void testReadjustmentWithlowerGrade() {
		User user = new User();
		user.setSalary(1000d);
		user.setName("Peter");
		user.readjustment(9.0);
		double salary = user.getSalary();
		Assertions.assertEquals(1500, salary);
		System.out.println(user.getSalary());

	}
}
