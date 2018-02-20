package bus;

import java.io.Serializable;

public abstract class Employee implements IPayable,  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1801814098850961774L;
	
	int id;
    String fn;
    String ln;
    String email;
    String telephone;
    Address address;  
    String ssn;
    EnumType type;
    EnumJob job;
    int performance;
    
	public int getPerformance() {
		return performance;
	}
	public void setPerformance(int performance) {
		this.performance = performance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id =  Sequence.getIndex();
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) throws MyException {
		Validation.validName(fn);
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) throws MyException{
		Validation.validName(ln);
		this.ln = ln;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws MyException {
		Validation.validEmail(email);
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) throws MyException {
		Validation.validSsn(ssn);
		this.ssn = ssn;
	}
	public EnumType getType() {
		return type;
	}
	public void setType(EnumType type) {
		this.type = type;
	}
	
	public EnumJob getJob() {
		return job;
	}
	public void setJob(EnumJob job) {
		this.job = job;
	}
	
	public Employee() {
		super();
	}
	
	public Employee(String fn, String ln, String email,
			String telephone, Address address, String ssn, EnumType type, EnumJob job) {
		super();
		setId(this.id );
		this.fn = fn;
		this.ln = ln;
		this.email = email;
		this.telephone = telephone;
		this.address = address;
		this.ssn = ssn;
		this.type = type;
		this.job = job;
		this.performance = 0;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fn=" + fn + ", ln=" + ln + ", email="
				+ email + ", telephone=" + telephone + ", address=" + address
				+ ", ssn=" + ssn + ", type=" + type + ", job=" + job + ", performance level=" + performance + "]";
	}
	
	
    
}
