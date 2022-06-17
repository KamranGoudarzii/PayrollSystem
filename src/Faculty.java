import java.util.Calendar;

enum Level { AS, AO, FU	}

public class Faculty extends Employee  implements Cloneable
{
	Level level;
	
	Education education;

	public Faculty(String ln, String fn, String id, char g, Calendar bday, String degree, String major, int researches, String level) {
		
		super( ln,  fn,  id,  g,  bday);
		
		if(level.equals("Full"))
			this.level = Level.FU;
		
		else if(level.equals("Associate"))
			this.level = Level.AO;
		
		else if(level.equals("Assistant"))
			this.level = Level.AS;
		
		this.education = new Education(degree, major, researches);
	}
	
	public Faculty() 
	{
		education = new Education();
		level = Level.AS;
	}

	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	
	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}
	

	@Override
	public double monthlyEarnings() 
	{
		double salary = 0;
		
		switch(this.level) {
	      case AS:
	        salary = FACULTY_MONTHLY_SALARY; 
	        break;
	      case AO:
	    	salary = FACULTY_MONTHLY_SALARY * 1.2; 
	        break;
	      case FU:
	    	  salary = FACULTY_MONTHLY_SALARY * 1.4; 
	        break;
	    }
		
		return salary;
		
	}
	
	public String toString() 
	{
		
		String designation ="";
		
		switch(this.level) {
	      case AS:
	    	  designation = "Assisstant Professor";
	        break;
	      case AO:
	    	  designation = "Associate Professor";
	        break;
	      case FU:
	    	  designation = "Professor";
	        break;
	    }
		
		String result = super.toString()
		                     + designation+"\nMonthly Salary: "
		                     +String.valueOf(this.monthlyEarnings())+"\n";
		return result;
		
	}
	
	
	
	

	
}
