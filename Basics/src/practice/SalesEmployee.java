package practice;

public class SalesEmployee extends Employee{
	
	private Integer sales;
	private double commission;
	private double netSalary;
	private double basicSal;
	
	
	public SalesEmployee() {
		
	}
	public SalesEmployee(Integer empId,String name,double sal,Address address,Integer sales) {
		super(empId,name,sal,address);
		this.sales = sales;
		
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	void CalculateSalary() {
		basicSal = super.getSalary();
		System.out.println("Basic sal : "+basicSal);
		Integer s = getSales();
		if(s<5000) {
			setCommission(2);
		}
		else if(s>=5000 && s<10000) {
			setCommission(5);
		}
		else if(s>=10000 && s<15000) {
			setCommission(7);
		}
		else {
			setCommission(10);
		}
		netSalary = basicSal + (commission*basicSal)/100;
		System.out.println("Net Salary is "+netSalary);
		
	}
	

}
