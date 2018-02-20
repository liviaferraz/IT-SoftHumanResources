package bus;
import java.io.Serializable;
import java.util.Comparator;

public class SsnComparator implements Comparator<Employee>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8952971249304979708L;

	public int compare(Employee emp1, Employee emp2){		
		if(emp1.getSsn().equals(emp2.getSsn()))	
			return 0;
		else if(emp1.getSsn().compareTo(emp2.getSsn())>0)
			return 1;			
		else 
			return -1;
		
	}
}

