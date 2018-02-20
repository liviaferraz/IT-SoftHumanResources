package bus;

import java.io.Serializable;

public class PartTime extends Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1547023633737759432L;
	
	int hoursWorked;
	double hourlyRate;
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public PartTime() {
		super();
	}
	
	public PartTime(String fn, String ln, String email,
			String telephone, Address address, String ssn, EnumType type, EnumJob job, 
			int hoursWorked, double hourlyRate) {
		super(fn, ln, email, telephone, address, ssn, type, job);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public double calculPayment()
	{	
		double calculatedSalary;
		
		if(getPerformance()==1){
			calculatedSalary = Math.round((hoursWorked*hourlyRate*2)*1.015);
		}
		else if (getPerformance()==2){
			calculatedSalary = Math.round((hoursWorked*hourlyRate*2)*1.01);
		}
		else {
			calculatedSalary = Math.round(hoursWorked*hourlyRate*2);
		}
		return calculatedSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fn=" + fn + ", ln=" + ln
				+ ", email=" + email + ", telephone=" + telephone
				+ ", address=" + address + ", ssn=" + ssn + ", type=" + type
				+ ", job=" + job + ", hoursWorked =" + hoursWorked +", hourlyRate="
				+ hourlyRate + ", payment=" + calculPayment() + "]";
	}
	
	
}
