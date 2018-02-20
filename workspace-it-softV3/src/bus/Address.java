package bus;
import java.io.Serializable;

public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3234464884148823307L;
	
	int streetNumber;
    String streetName;
    int aptNumber;
    String city;
    String province;
    String country;
    String postalCode;
    
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getAptNumber() {
		return aptNumber;
	}
	public void setAptNumber(int aptNumber) {
		this.aptNumber = aptNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) throws MyException {
		Validation.validPostalCode(postalCode);
		this.postalCode = postalCode;
	}
	public Address() {
		super();
	}
	public Address(int streetNumber, String streetName, int aptNumber,
			String city, String province, String country, String postalCode) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.aptNumber = aptNumber;
		this.city = city;
		this.province = province;
		this.country = country;
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", streetName="
				+ streetName + ", aptNumber=" + aptNumber + ", city=" + city
				+ ", province=" + province + ", country=" + country
				+ ", postalCode=" + postalCode + "]";
	}
    
    
}
