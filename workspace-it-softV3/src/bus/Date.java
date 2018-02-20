package bus;

import java.io.Serializable;

public class Date implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -99031208184127388L;
	
	int month;
	int day;
	int year;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date() {
		super();
	}
	
	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + "]";
	}
}
