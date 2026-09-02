package UserJunit;

public class User {

	private String name;
	private Double salary;

	public User() {

	}

	public void readjustment(Double grade) {
		if (grade > 8) {
			setSalary(getSalary() * 1.50);
		} else {
			setSalary(getSalary() * 1.10);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(double d) {
		this.salary = d;
	}

}
