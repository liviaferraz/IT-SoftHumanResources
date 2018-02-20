package prod;
import bus.*;
import data.FileHandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;


public class ItSoftTester {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee e1 = new FullTime("livia", "ferraz", "liviaferraz@outlook.com", "(514)701-8910",
				new Address(1411, "Rue du Fort", 310, "Montreal", "Quebec", "Canada",
                "H3H2N7"), "222ABCD", EnumType.director, EnumJob.fulltime, 1000000 );
		
		Employee e2 = new FullTime("onelia", "ferraz", "oneliaferraz@outlook.com", "(514)777-9999",
				new Address(1411, "Rue du Fort", 310, "Montreal", "Quebec", "Canada",
                "H3H2N7"), "222-1111-1111", EnumType.secretary, EnumJob.fulltime,60000 );
		
		Employee e3 = new FullTime("Vitor", "Moura", "vitormoura@outlook.com", "(514)888-1010",
				new Address(1411, "Rue du Fort", 310, "Montreal", "Quebec", "Canada",
                "H3H2N7"), "333-1111-1111", EnumType.programmer,EnumJob.fulltime, 80000 );
		
		Employee e4 = new PartTime("Cybele", "Ferraz", "cybeleferraz@outlook.com", "(514)222-0209",
				new Address(1411, "Rue du Fort", 310, "Montreal", "Quebec", "Canada",
                "H3H2N7"), "444-1111-1111", EnumType.trainee, EnumJob.parttime ,20, 20 );
		
		Employee e5 = new PartTime("Claudio", "Silva", "claudiosilva@outlook.com", "(514)444-0209",
				new Address(1411, "Rue du Fort", 310, "Montreal", "Quebec", "Canada",
                "H3H2N7"), "555-1111-1111", EnumType.trainer, EnumJob.parttime, 20, 25 );

        DataCollection.add(e1);
        DataCollection.add(e2);
        DataCollection.add(e3);
        DataCollection.add(e4);
        DataCollection.add(e5);
		
        for(Employee element: DataCollection.getMyList()){
			System.out.println(element);
		}
        
      
        do{
        	String choice;
        	boolean valid = false;	
        	switch(DataCollection.mainMenu()){
        	
        	case 1: //list all
        		for(Employee element: DataCollection.getMyList()){
        			System.out.println(element);
        		}
        		break;
        	case 2://add fulltime
        		Scanner scan = new Scanner(System.in);
        		FullTime e6 = new FullTime();
        		
        		e6.setId(Sequence.getIndex());
        		
        		System.out.println("\n Enter the first name: ");
        		//e6.setFn(scan.next());
        		valid = false;
        		do{
					try {
						e6.setFn(scan.next() );
						valid = true;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					}while(!valid);
 
        		
        		System.out.println("\n Enter the last name: ");
        		//e6.setLn(scan.next());
        		valid = false;
        		do{
					try {
						e6.setLn(scan.next() );
						valid = true;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					}while(!valid);
        		
        		System.out.println("\n Enter the email: ");
        		//e6.setEmail(scan.next());
        		valid = false;
        		do{
					try {
						e6.setEmail(scan.next() );
						valid = true;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					}while(!valid);
        		
        		System.out.println("\n Enter the telephone number: ");
        		e6.setTelephone(scan.next());
        		System.out.println("\n Enter the address ");
        		System.out.println("\n\t Enter the street number: ");
        		Address ad = new Address();
        		ad.setStreetNumber(scan.nextInt());
        		System.out.println("\n\t Enter the street name: ");
        		ad.setStreetName(scan.next());
        		System.out.println("\n\t Enter the apartment number: ");
        		ad.setAptNumber(scan.nextInt());
        		System.out.println("\n\t Enter the city name: ");
        		ad.setCity(scan.next());
        		System.out.println("\n\t Enter the province name: ");
        		ad.setProvince(scan.next());
        		System.out.println("\n\t Enter the country name: ");
        		ad.setCountry(scan.next());
        		System.out.println("\n\t Enter the postalcode: ");
        		//ad.setPostalCode(scan.next());
        		valid = false;
        		do{
					try {
						ad.setPostalCode(scan.next());
						valid = true;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					}while(!valid);  		
        		
        		e6.setAddress(ad);
        		System.out.println("\n Enter the social security number: ");
        		//e6.setSsn(scan.next());
        		valid = false;
        		do{
					try {
						e6.setSsn(scan.next());
						valid = true;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					}while(!valid); 
        		
        		
        		System.out.println("\n Enter the job title of the employee: ");
        		System.out.println("\n Choose between the following:");
        		System.out.println("\n 1 - Programmer");
        		System.out.println("\n 2 - Director");
        		System.out.println("\n 3 - Secretary");
        		int job;
        		job = scan.nextInt();
        		if (job == 1){
        			e6.setType(EnumType.programmer);
        		}
        		else if(job == 2){
        			e6.setType(EnumType.director);
        		}
        		else if(job == 3){
        			e6.setType(EnumType.secretary);
        		}
        		else{
        			System.out.println("Please type 1, 2 or 3.");
        		}
        		
        		/*System.out.println("\n Enter 1 for FULLTIME job or 2 for PART-Time job: ");
        		int job2;
        		job2 = scan.nextInt();
        		if (job2 == 1){
        			e6.setJob(EnumJob.fulltime);
        		}
        		else if(job2 == 2){
        			e6.setJob(EnumJob.parttime);
        		}
        		else{
        			System.out.println("Please type 1 or 2 ");
        		}*/
        		e6.setJob(EnumJob.fulltime);
        		
        		System.out.println("\n Enter the annual salary: ");	
        		e6.setSalary(scan.nextInt());
        		DataCollection.add(e6);
        		System.out.println("\n The employee was added ");	
        		break;
        		
        		
        	case 3://add part time
        		Scanner scan1 = new Scanner(System.in);
        		PartTime e7 = new PartTime();
        		e7.setId(Sequence.getIndex());
        		System.out.println("\n Enter the first name: ");
        		//e7.setFn(scan1.next());
        		valid = false;
        		do{
					try {
						e7.setFn(scan1.next() );
						valid = true;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					}while(!valid);
        		
        		System.out.println("\n Enter the last name: ");
        		//e7.setLn(scan1.next());
        		valid = false;
        		do{
					try {
						e7.setLn(scan1.next() );
						valid = true;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					}while(!valid);
        		
        		System.out.println("\n Enter the email: ");
        		//e7.setEmail(scan1.next());
        		valid = false;
        		do{
					try {
						e7.setEmail(scan1.next() );
						valid = true;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					}while(!valid);
        		
        		System.out.println("\n Enter the telephone number: ");
        		e7.setTelephone(scan1.next());
        		System.out.println("\n Enter the address ");
        		System.out.println("\n\t Enter the street number: ");
        		Address adr = new Address();
        		adr.setStreetNumber(scan1.nextInt());
        		System.out.println("\n\t Enter the street name: ");
        		adr.setStreetName(scan1.next());
        		System.out.println("\n\t Enter the apartment number: ");
        		adr.setAptNumber(scan1.nextInt());
        		System.out.println("\n\t Enter the city name: ");
        		adr.setCity(scan1.next());
        		System.out.println("\n\t Enter the province name: ");
        		adr.setProvince(scan1.next());
        		System.out.println("\n\t Enter the country name: ");
        		adr.setCountry(scan1.next());
        		System.out.println("\n\t Enter the postalcode: ");
        		//adr.setPostalCode(scan1.next());
        		valid = false;
        		do{
					try {
						adr.setPostalCode(scan1.next());
						valid = true;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					}while(!valid);
        		
        		e7.setAddress(adr);
        		
        		System.out.println("\n Enter the social security number: ");
        		//e7.setSsn(scan1.next());
        		valid = false;
        		do{
					try {
						e7.setSsn(scan1.next());
						valid = true;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					}while(!valid);
        		
        		System.out.println("\n Enter the job title of the employee: ");
        		System.out.println("\n Choose between the following:");
        		System.out.println("\n 1 - Trainer");
        		System.out.println("\n 2 - Trainee");
        		int job3;
        		job3 = scan1.nextInt();
        		if (job3 == 1){
        			e7.setType(EnumType.trainer);
        		}
        		else if(job3 == 2){
        			e7.setType(EnumType.trainee);
        		}
        		else{
        			System.out.println("Please type 1 or 2");
        		}
        		System.out.println("\n Enter 1 for FULLTIME job or 2 for PART-Time job: ");
        		int job4;
        		job4 = scan1.nextInt();
        		if (job4 == 1){
        			e7.setJob(EnumJob.fulltime);
        		}
        		else if(job4 == 2){
        			e7.setJob(EnumJob.parttime);
        		}
        		else{
        			System.out.println("Please type 1 or 2 ");
        		}
        		System.out.println("\n Enter the hours worked per week: ");	
        		e7.setHoursWorked(scan1.nextInt());
        		System.out.println("\n Enter the hourly rate: ");	
        		e7.setHourlyRate(scan1.nextDouble());
        		DataCollection.add(e7);
        		System.out.println("\n The employee was added ");
        		
        		break;
        	case 4://Search by id
        		Scanner scan2 = new Scanner(System.in);
        		System.out.println("Please type the id you want to search:");
        		int tempId;
        		tempId = scan2.nextInt();
        		DataCollection.search(tempId);
        		System.out.println(DataCollection.search(tempId));

        		
        		break;
        	case 5://sort by id
        		System.out.println("The employees were sorted successfully.");
        		IdComparator idComparatorObject = new IdComparator();
        		Collections.sort(DataCollection.getMyList(),idComparatorObject);
        		for(Employee element: DataCollection.getMyList()){
        			System.out.println(element);
        		}   		

        		break;
        	case 6://sort by ssn
        		System.out.println("The employees were sorted successfully.");
        		SsnComparator ssnComparatorObject = new SsnComparator();
        		Collections.sort(DataCollection.getMyList(),ssnComparatorObject);
        		for(Employee element: DataCollection.getMyList()){
        			System.out.println(element);
        		}   		
        		
        		/*int quit = scan.nextInt(DataCollection.quitApp());
        		if (quit==0){
        			break;
        		}*/
        		break;
        	case 7: //modify
        		Scanner scan3 = new Scanner(System.in);
        		System.out.println("\nPlease type the employee id you want to modify:");
        		int tempId2;
        		tempId2 = scan3.nextInt();
        		System.out.println("\n Enter 1 to make this employee FULLTIME or 2 to make this employee PART-Time: ");
        		int job5;
        		job5 = scan3.nextInt();
        		System.out.println(DataCollection.modify(tempId2, job5));        		
        		break;
        		
        	case 8: //write to serialized (binary)
        		FileHandler.writeToFile(DataCollection.getMyList());
        		System.out.println("\nThe binary file was written");
        		break;
        		
        	case 9: //read from serialized (binary)
        		System.out.println("\n We are reading data from a binary file (employees)... \n");	
        		ArrayList<Employee> empFromFile = new ArrayList<Employee>();
        		empFromFile = FileHandler.readFromFile();
        		
        		for	(Employee element: empFromFile){
        			System.out.println(element);
        		}        		
        		break;
        	case 10://read txt file
        		PerformanceLevel[] perfFromTextFile = new PerformanceLevel[2];
        		
        		System.out.println("\n Reading performance level from text file ");
        		FileReader inFile = new FileReader("src/data/PerformanceLevel.txt");
        		BufferedReader reader = new BufferedReader(inFile);
        		StringTokenizer myToken;
        		String record;
        		for(int index=0;index<perfFromTextFile.length;index++){
        			record = reader.readLine();
        			myToken = new StringTokenizer(record, "|");
        			PerformanceLevel aLevel = new PerformanceLevel(Integer.parseInt(myToken.nextToken()), myToken.nextToken(), 
        					Double.parseDouble(myToken.nextToken()) );
        			perfFromTextFile[index] = aLevel;
        			
        		}
        		
        		reader.close();
        		
        		for(int i=0; i< perfFromTextFile.length; i++){
        			System.out.println(perfFromTextFile[i]);
        		}
        		
        		break;
        		
        	case 11:
        		Scanner scan4 = new Scanner(System.in);
        		System.out.println("\n Enter the employee Id you want to set a perfomance level:");
        		int tempId3;
        		tempId3 = scan4.nextInt();
        		DataCollection.search(tempId3);
        		System.out.println(DataCollection.search(tempId3));
        		
        		System.out.println("\n Enter the performance level of this employee (0, 1 or 2): ");
        		int tempPerformance;
        		tempPerformance = scan4.nextInt();
        		DataCollection.setPerfomance(tempId3, tempPerformance);
        		System.out.println("\n The perfomance level was applied ");
        		System.out.println(DataCollection.search(tempId3));
        		break;
        		
        	default:
    			break;
        	}
        	
        	
        }while (true);
	}

	
	
}
