import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public abstract class Employee implements EmployeeInfo,  Comparable<Employee>, Cloneable{

	String lastName;
	String firstName;
	String ID;
	char Sex;
	Calendar birthDate;
	
	public Employee()
	{
		lastName = "";
		firstName = "";
		ID = "";
		Sex = 'M';
		birthDate = null;
		
	}
	public Employee(String ln, String fn, String id, char g, Calendar bday)
	{
		lastName = ln;
		firstName = fn;
		ID = id;
		Sex = g;
		birthDate = bday;
		
	}
	
	public Object clone()throws CloneNotSupportedException
	{  
		return super.clone();  
	}  
	
	
	@Override
	public int compareTo(Employee b){ 
	    
		if(Integer.parseInt(ID)==Integer.parseInt(b.getID()))  
	    	return 0;  	    
	    else if(Integer.parseInt(ID) > Integer.parseInt(b.getID()))  
	    	return 1;  
	    else  
	    	return -1;  
	    }  
	
	public String toString() 
	{
		DateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
		String result = "ID Employee number: " + ID + 
				"\nEmployee name: " + firstName + " " + lastName +
				"\nBirth date: " + sdf.format(birthDate.getTime()) +"\n";
		return result;
		
	}
	
	
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public char getSex() {
		return Sex;
	}
	public void setSex(char sex) {
		Sex = sex;
	}
	public Calendar getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}
	
	
	public abstract double monthlyEarnings();

}
