import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class part5 {

	public static void setDate(Calendar c, int month,  int day, int year) 
	{
		c.set(Calendar.DAY_OF_MONTH , day);  
		c.set(Calendar.MONTH , month);  
		c.set(Calendar.YEAR , year);  
		
	}
	
	public static void main(String[] args) {
	
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		//Staff 1
		
		Calendar c1 =Calendar.getInstance();  
		
		setDate(c1, 2 , 23 , 59); 
		
		employees.add(new Staff("Allen", "Paita", "123", 'M', c1, 50));		
		
		//Staff 2
		
		Calendar c2 =Calendar.getInstance();  
		
		setDate(c2, 7 , 12 , 64);  
		
		employees.add(new Staff("Zapata", "Steven", "456", 'F', c2, 35));	
		
		
		//Staff 3
		
		Calendar c3 =Calendar.getInstance();  
		
		setDate(c3, 6 , 2 , 70);  
		
		employees.add( new Staff("Rios", "Enrique", "789", 'M', c3, 40));	
		
		
		//Faculty 1
		
		Calendar c4 =Calendar.getInstance();  
		
		setDate(c4, 4 , 27 , 62); 
		
		employees.add( new Faculty("Johnson", "Anne", "243", 'F', c4, "Ph.D", "Engineering", 3, "Full"));		
		
		//Faculty 2

		Calendar c5 =Calendar.getInstance();  
		
		setDate(c5, 3 , 14 , 75); 
		
		employees.add( new Faculty("Bouris", "William", "791", 'F', c5, "Ph.D", "English", 1, "Associate"));	

		//Faculty 3

		Calendar c6 =Calendar.getInstance();  
		
		setDate(c6, 5 , 22 , 80); 
		
		employees.add( new Faculty("Andrade", "Christopher", "623", 'F', c6, "MS", "Physical Education", 0, "Assistant"));	

		
		
		//Part-time 1
		
		Calendar c7 =Calendar.getInstance();  
		
		setDate(c7, 8 , 10 , 77); 
		
		employees.add( new Partime("Guzman", "Augusto", "455", 'F', c7, 35, 30 ));		
		
		
		//Part-time 2
		
		Calendar c8 =Calendar.getInstance();  
		
		setDate(c8, 9 , 15 , 87); 
		
		employees.add( new Partime("Depirro", "Martin", "678", 'F', c8, 30, 15 ));		
				
		
		//Part-time 3
		
		Calendar c9 =Calendar.getInstance();  
		
		setDate(c9, 11 , 24 , 88); 
		
		employees.add( new Partime("Aldaco", "Marque", "945", 'M', c9, 20, 35 ));		
		

		
		//e) Display all employee information ascending by last name using interface
		Collections.sort(employees,  new SortEmployeesByLastName());

		System.out.println("\n\n::: Sorted List of Employees by last Name :::\n\n");
			
		for(int i=0; i<9; i++)
			System.out.println(employees.get(i).toString());
	


	}

}
