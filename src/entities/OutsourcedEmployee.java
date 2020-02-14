package entities;

public class OutsourcedEmployee extends Employee{

	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}	
	
	@Override
	public Double payment() {		
		Double add = additionalCharge * 1.1;
		Double payment = getValuePerHour() * getHours() + add;
		return payment;
	}
}
