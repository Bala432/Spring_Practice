package spring.example;

public class Address{
	private String city;
	private String state;
	private String laneNo;
	private String houseNo;
	
	public Address() {
		
		System.out.println("Default Address Constructor called");
		city="";
		state="";
		laneNo="";
		houseNo="";
	}
	
	public Address(String city, String state, String laneNo, String houseNo) {
		super();
		System.out.println("Parameterised Address constructor called");
		this.city = city;
		this.state = state;
		this.laneNo = laneNo;
		this.houseNo = houseNo;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", laneNo=" + laneNo + ", houseNo=" + houseNo + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLaneNo() {
		return laneNo;
	}
	public void setLaneNo(String laneNo) {
		this.laneNo = laneNo;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	};
	
	

}

