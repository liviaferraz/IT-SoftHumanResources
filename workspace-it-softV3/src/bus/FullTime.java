package bus;

import java.io.Serializable;

public class FullTime extends Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3479246397685350525L;
	
	double annualSalary;

	public double getSalary() {
	return annualSalary;
	}

	public void setSalary(double annualSalary) {
	this.annualSalary = annualSalary;
	}

	public FullTime() {
		super();
	}

	public FullTime(String fn, String ln, String email, String telephone,
			Address address, String ssn, EnumType type, EnumJob job, double annualSalary) {
		super(fn, ln, email, telephone, address, ssn, type, job);
		this.annualSalary = annualSalary;
	}
	
	public double calculPayment()
	{
		double calculatedSalary;
		
		if(getPerformance()==1){
			calculatedSalary = Math.round( ((annualSalary/52)*2)*1.015);
		}
		else if (getPerformance()==2){
			calculatedSalary = Math.round( ((annualSalary/52)*2)*1.01);
		}
		else {
			calculatedSalary = Math.round((annualSalary/52)*2);
		}
		return calculatedSalary;
	}

	@Override
	public String toString() {
		return "Employee [ id=" + id
				+ ", fn=" + fn + ", ln=" + ln + ", email=" + email
				+ ", telephone=" + telephone + ", address=" + address
				+ ", ssn=" + ssn + ", type=" + type +  ", job=" + job + ", annualSalary=" + 
				annualSalary + ", payment=" + calculPayment() + "]";
	}
	
	
}
