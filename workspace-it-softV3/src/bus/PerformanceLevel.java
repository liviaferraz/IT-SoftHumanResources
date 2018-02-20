package bus;

public class PerformanceLevel {
	int perfId;
	String perfDescr;
	Double perfRate;
	public int getPerfId() {
		return perfId;
	}
	public void setPerfId(int perfId) {
		this.perfId = perfId;
	}
	public String getPerfDescr() {
		return perfDescr;
	}
	public void setPerfDescr(String perfDescr) {
		this.perfDescr = perfDescr;
	}
	public Double getPerfRate() {
		return perfRate;
	}
	public void setPerfRate(Double perfRate) {
		this.perfRate = perfRate;
	}
	public PerformanceLevel() {
		super();
	}
	public PerformanceLevel(int perfId, String perfDescr, Double perfRate) {
		super();
		this.perfId = perfId;
		this.perfDescr = perfDescr;
		this.perfRate = perfRate;
	}
	@Override
	public String toString() {
		return perfId + "|" + perfDescr + "|" + perfRate;
	}
	
	
}
