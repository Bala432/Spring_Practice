package practice;

public class Employee {
	
	private Integer empId;
	private String name;
	private double salary;
	private Address address;
	
	public Employee() {
		System.out.println("Default Constructor called");
		this.address = new Address();
	}
	
	public Employee(Integer empId, String name, double salary,Address address) {
		System.out.println("Parameterised Constructor called");
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
}
