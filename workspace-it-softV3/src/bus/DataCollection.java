package bus;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;

public class DataCollection implements Serializable {

	private static final long serialVersionUID = -6590149205652629343L;
	
	

	private static ArrayList <Employee> myList = new ArrayList <Employee>();

		public static ArrayList<Employee> getMyList() {
			return myList;
		}

		public static void setMyList(ArrayList<Employee> myList) {
			DataCollection.myList = myList; //mudei aqui
		}

		/*private ArrayList <Employee> myList;
		
		public ArrayList<Employee> getMyList() {
			return myList;
		}
		public void setMyList(ArrayList<Employee> myList) {
			this.myList = myList;
		}
		
		public DataCollection()
		{
			myList = new  ArrayList<Employee>();		
		}*/
		
		//Services
		public static void add(Employee emp)
		{
			myList.add(emp);				
		}
		
		public static void remove (Employee emp)
		{
			myList.remove(emp);
		}
		
		/*public void removeByIndex (String SSN)
		{
			for(Employee current: myList)
			{
				if(current.getSocialSecurity()==SSN)
				{
					this.myList.remove(current);
					break;
				}
			}
		}*/
		
		public static Employee search(int index)
		{
			for (Employee current : myList)
			{
		        if(    current.getId()== index  )
		        {			
				   return current;
		        }
			}	
			return null;		
		}
		
		public static Employee search(String SSN)
		{
			for(Employee current : myList)
			{
				if(current.getSsn().equals(SSN))
				{
					return current;
				}
			}
			return null;	
		}
		
		//modify
		public static Employee modify(int index, int job){
			for(Employee current : myList)
			{
				if(current.getId()== index)
				{
					if (job ==1)  {
						current.setJob(EnumJob.fulltime);
					}
					else if(job ==2){
						current.setJob(EnumJob.parttime);
					}				
					return current;
				}
			}
			return null;
		}
		
		//set performance level
		public static Employee setPerfomance(int index, int performance){
			for(Employee current : myList)
			{
				if(current.getId()== index)
				{
					current.setPerformance(performance);
					return current;
				}
			}
			return null;
		}
			
		public String toString() {
			String state = "";
			for(Employee current: myList)
			{
				state += current + "\n";
			}		
			return state;
		}
		
		public static int mainMenu()
		{
			int input;
			Scanner scan = new Scanner(System.in);
			System.out.println("\n\n\t\t IT-Soft Human Resources ");
			System.out.println("\n\n--------------- MAIN MENU ---------------");
			System.out.println("\n\t1 - List all employees");
			System.out.println("\n\t2 - Add a new FullTime employee");
			System.out.println("\n\t3 - Add a new PartTime employee");
			System.out.println("\n\t4 - Search for an employee by id");
			System.out.println("\n\t5 - Sort all employees by id");
			System.out.println("\n\t6 - Sort all employees by SSN");
			System.out.println("\n\t7 - Modify an employee");
			System.out.println("\n\t8 - Write data in a binary file");
			System.out.println("\n\t9 - Read data from a binary file");
			System.out.println("\n\t10 - Read data from text file - Performance Level");
			System.out.println("\n\t11 - Set Performance Level for an Employee");
			System.out.println("\n\t What type of function you want to execute?");
			input = scan.nextInt();
			return input;
		}
		
		/*public static int quitApp(){
			String choice;
			Scanner scan = new Scanner(System.in);
			System.out.println("\n\tAre you sure you want to quit the application? (Y/N)");
    		choice = scan.next();
    		if(choice.equals('Y')||choice.equals('y')){
    			return 0;
    		}
			return 1;
		}*/
}
