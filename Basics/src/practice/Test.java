package practice;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalesEmployee se = new SalesEmployee(101,"ravi",6583,new Address("guntur","AP","17","284"),100);
		se.CalculateSalary();
		
//		ArrayList<Employee>eList = new ArrayList<Employee>();
//		eList.add(new Employee(102,"varsha",10000,new Address("guntur","AP","17","284")));
//		eList.add(new Employee(103,"kumar",30000,new Address("Hyderabad","Telangana","19","384")));
//		
//		for(Employee emp:eList)
//			System.out.println(emp);
//		
	}

}
