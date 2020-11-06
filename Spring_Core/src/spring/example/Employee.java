package spring.example;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private Integer empId;
	private String name;
	private double salary;
	private Address address;
	private List<String>technologies;
	private List<Project>project;
	
	public Employee() {
		System.out.println("Default Constructor called");
		this.address = new Address();
		this.technologies = new ArrayList<String>();
	}
	
	
	public Employee(Integer empId, String name, double salary, Address address, List<String> technologies,
			List<Project> project) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.technologies = technologies;
		this.project = project;
	}











	public List<Project> getProject() {
		return project;
	}


	public void setProject(List<Project> project) {
		this.project = project;
	}


	public Address getAddress() {
		return address;
	}





	public void setAddress(Address address) {
		this.address = address;
	}





	public List<String> getTechnologies() {
		return technologies;
	}





	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
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
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", technologies=" + technologies + ", project=" + project + "]";
	}









	

	
}
